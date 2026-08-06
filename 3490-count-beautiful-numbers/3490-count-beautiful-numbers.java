import java.util.*;

class Solution {

    public int beautifulNumbers(int l, int r) {
        return count(String.valueOf(r), 0, true, true, false, 0, 1, new HashMap<>())
                - count(String.valueOf(l - 1), 0, true, true, false, 0, 1, new HashMap<>());
    }

    private int count(String s, int idx, boolean tight,
                      boolean leadingZero, boolean hasZero,
                      int sum, int product,
                      Map<String, Integer> memo) {

        if (idx == s.length()) {
            if (leadingZero)
                return 0;
            return (hasZero || product % sum == 0) ? 1 : 0;
        }

        String key = idx + "_" + tight + "_" + leadingZero + "_"
                + hasZero + "_" + sum + "_" + product;

        if (!tight && memo.containsKey(key))
            return memo.get(key);

        // If a non-leading zero has already appeared,
        // every completion is beautiful.
        if (!leadingZero && hasZero && !tight) {
            int ans = (int) Math.pow(10, s.length() - idx);
            memo.put(key, ans);
            return ans;
        }

        int limit = tight ? s.charAt(idx) - '0' : 9;
        int ans = 0;

        for (int d = 0; d <= limit; d++) {

            boolean nextTight = tight && (d == limit);
            boolean nextLeadingZero = leadingZero && d == 0;
            boolean nextHasZero = !nextLeadingZero && d == 0;

            int nextProduct = nextLeadingZero ? 1 : product * d;

            ans += count(
                    s,
                    idx + 1,
                    nextTight,
                    nextLeadingZero,
                    nextHasZero,
                    sum + d,
                    nextProduct,
                    memo
            );
        }

        if (!tight)
            memo.put(key, ans);

        return ans;
    }
}