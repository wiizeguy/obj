class ExamResults {
    private int[] points;

    ExamResults(int[] points) {
        this.points = points;
    }

    public int[] getPoints() {
        // return this.points;
        return this.points.clone();
    }
};

void main() {
    int[] a = new int[]{0, 1, 2};
    ExamResults e = new ExamResults(a);

    a[0] = 5;
    assert e.getPoints()[0] == 5;

    e.getPoints()[1] = 0;
    // assert e.getPoints()[1] == 0; // bez kopii
    assert e.getPoints()[1] == 1; // z kopią
}
