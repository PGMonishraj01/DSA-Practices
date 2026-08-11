class Solution {
    static class Node {
        int cnt;
        long first, last;
        long sumSq;

        Node() {
            cnt = 0;
            first = -1;
            last = -1;
            sumSq = 0;
        }
    }

    private Node[] tree;
    private int n;
    private int[] nums;

    private boolean isPeak(int i) {
        if (i <= 0 || i >= n - 1) return false;
        return nums[i] > nums[i - 1] && nums[i] > nums[i + 1];
    }

    private Node merge(Node left, Node right) {
        if (left.cnt == 0) return right;
        if (right.cnt == 0) return left;

        Node res = new Node();
        res.cnt = left.cnt + right.cnt;
        res.first = left.first;
        res.last = right.last;
        
        long gap = right.first - left.last;
        res.sumSq = left.sumSq + right.sumSq + gap * gap;
        return res;
    }

    private void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = new Node();
            if (isPeak(start)) {
                tree[node].cnt = 1;
                tree[node].first = start;
                tree[node].last = start;
                tree[node].sumSq = 0;
            }
            return;
        }
        int mid = (start + end) / 2;
        build(2 * node, start, mid);
        build(2 * node + 1, mid + 1, end);
        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    private void update(int node, int start, int end, int idx) {
        if (start == end) {
            tree[node] = new Node();
            if (isPeak(start)) {
                tree[node].cnt = 1;
                tree[node].first = start;
                tree[node].last = start;
                tree[node].sumSq = 0;
            }
            return;
        }
        int mid = (start + end) / 2;
        if (idx <= mid) {
            update(2 * node, start, mid, idx);
        } else {
            update(2 * node + 1, mid + 1, end, idx);
        }
        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    private Node query(int node, int start, int end, int l, int r) {
        if (l > end || r < start) return new Node();
        if (l <= start && end <= r) return tree[node];

        int mid = (start + end) / 2;
        Node left = query(2 * node, start, mid, l, r);
        Node right = query(2 * node + 1, mid + 1, end, l, r);
        return merge(left, right);
    }

    public long[] countOfPeaks(int[] nums, int[][] queries) {
        this.n = nums.length;
        this.nums = nums;
        this.tree = new Node[4 * n];

        build(1, 0, n - 1);

        int type1Count = 0;
        for (int[] q : queries) {
            if (q[0] == 1) type1Count++;
        }

        long[] ans = new long[type1Count];
        int idx = 0;

        for (int[] q : queries) {
            if (q[0] == 1) {
                int l = q[1];
                int r = q[2];

                if (r - l < 2) {
                    ans[idx++] = 0;
                    continue;
                }
                Node res = query(1, 0, n - 1, l + 1, r - 1);

                if (res.cnt == 0) {
                    ans[idx++] = 0;
                } else {
                    long gapL = res.first - l;
                    long gapR = r - res.last;
                    long S = res.sumSq + gapL * gapL + gapR * gapR;
                    long D = r - l;
                    long peakSubarrays = (D * D - S) / 2;
                    ans[idx++] = peakSubarrays;
                }
            } else {
                int updateIdx = q[1];
                int val = q[2];
                nums[updateIdx] = val;
                for (int i = updateIdx - 1; i <= updateIdx + 1; i++) {
                    if (i >= 0 && i < n) {
                        update(1, 0, n - 1, i);
                    }
                }
            }
        }

        return ans;
    }
}
