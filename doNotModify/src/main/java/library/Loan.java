package library;

import java.time.Period;

public class Loan {
    public final Book book;
    public final Member member;
    public final Period period;

    public Loan(Book book, Member member, Period period) {
        this.book = book;
        this.member = member;
        this.period = period;
    }
}
