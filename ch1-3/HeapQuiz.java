class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];

        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }

        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[2] = hq[0];

        for (int y = 0; y < 4; y = y + 1) {

            if (hq[y] == null) {
                System.out.format("Object %d is null!", y);
            }

            else {
                System.out.format("y is %d\n", y);
                System.out.format("Object is %d\n", hq[y].id);
            }
        }
    }
}
