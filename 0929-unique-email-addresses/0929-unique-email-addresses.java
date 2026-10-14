import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String local = parts[0].split("\\+")[0];
            local = local.replace(".", "");

            String uniqueEmail = local + "@" + parts[1];

            set.add(uniqueEmail);
        }

        return set.size();
    }
}