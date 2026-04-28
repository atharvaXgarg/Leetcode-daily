class Solution {
    public List<Integer> numOfBurgers(int tomato, int cheese) {
        /* 4x+2y=Total tomato slices ; and x+y = Total cheese slice
        so we can use 2x+2y=2*cheese; 2x=Tomato-2*cheese
        we can say that for zero wastage Tomato-2*cheese should be even
          */
        ArrayList<Integer> al = new ArrayList<>();
        if ((tomato - 2 * cheese) % 2 != 0) {
            return al;
        }
        int big, small;
        big = (tomato - 2 * cheese) / 2;
        small = cheese - big;

        if (big >= 0 && small >= 0 && small + big == cheese && 4 * big + 2 * small == tomato) {
            al.add(big);
            al.add(small);
            return al;
        }
        return al;

    }
}
