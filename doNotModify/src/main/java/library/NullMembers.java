package library;

import java.util.List;

public class NullMembers {
    private final List<Member> members;

    public NullMembers(List<Member> members) {
        this.members = members;
    }

    public Member lookup(int membershipNumber) {
        return members.stream()
            .filter(m -> m.membershipNumber == membershipNumber)
            .findFirst()
            .orElse(null);
    }
}
