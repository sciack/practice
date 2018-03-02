package library;

import java.util.List;
import java.util.Optional;

public class OptionalMembers {
    private final List<Member> members;

    public OptionalMembers(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> lookup(int membershipNumber) {
        return members.stream()
            .filter(m -> m.membershipNumber == membershipNumber)
            .findFirst();
    }
}
