class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<String> list = Arrays.stream(score)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

        int[] arr = Arrays.copyOf(score, score.length);
        Arrays.sort(arr);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        int c = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            c++;

            int index = map.get(arr[i]);

            if (c == 1) {
                list.set(index, "Gold Medal");
            } else if (c == 2) {
                list.set(index, "Silver Medal");
            } else if (c == 3) {
                list.set(index, "Bronze Medal");
            } else {
                list.set(index, String.valueOf(c));
            }
        }

        return list.toArray(new String[0]);
    }
}