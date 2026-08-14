class Solution {

    static void generate(int[] arr, int start, int end,
            ArrayList<Integer> current,
            ArrayList<ArrayList<Integer>> result) {
        if (end == arr.length) {
            return;
        }

        current.add(arr[end]);

        result.add(new ArrayList<>(current));
        generate(arr, start, end + 1, current, result);
        current.remove(current.size() - 1);
    }

    public int sumOddLengthSubarrays(int[] arr) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int start = 0; start < arr.length; start++) {
            generate(arr, start, start,
                    new ArrayList<>(), result);
        }

        int sum = 0;

        for (ArrayList<Integer> list : result) {

            if (list.size() % 2 == 1) {

                for (int num : list) {
                    sum += num;
                }
            }
        }

        return sum;
    }
}