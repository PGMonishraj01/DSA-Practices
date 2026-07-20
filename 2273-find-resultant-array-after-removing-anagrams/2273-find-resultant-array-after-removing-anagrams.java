class Solution {
    public List<String> removeAnagrams(String[] words) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        int i = 0;

        while (i < list.size() - 1) {

            char[] a = list.get(i).toCharArray();
            char[] b = list.get(i + 1).toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                list.remove(i + 1);
            } else {
                i++;
            }
        }

        return list;
    }
}