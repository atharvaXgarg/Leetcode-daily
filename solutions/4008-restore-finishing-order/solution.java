class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < friends.length; i++) {
            al.add(friends[i]);
        }
        int j = 0;
        for (int i = 0; i < order.length && j < friends.length; i++) {
            if (al.contains(order[i])) {
                friends[j] = order[i];
                j++;
            }
        }
        return friends;

    }
}
