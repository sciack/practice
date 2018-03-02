package library;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Loans {

    private final Clock clock;
    private final int loanPeriodInDays;
    private final List<Loan> loans = new ArrayList<>();

    public Loans(Clock clock, int loanPeriodInDays) {
        this.clock = clock;
        this.loanPeriodInDays = loanPeriodInDays;
    }

    public List<Loan> lentTo(Member member) {
        return loans.stream()
            .filter(l -> l.member.equals(member))
            .collect(toList());
    }

    public Loan lend(Member member, Book book) {
        LocalDate now = LocalDate.now(clock);
        Loan newLoan = new Loan(book, member, Period.between(now, now.plusDays(loanPeriodInDays)));
        loans.add(newLoan);
        return newLoan;
    }
}
