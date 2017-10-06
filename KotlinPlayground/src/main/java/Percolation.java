public class Percolation {
    private int length;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n)throws IllegalArgumentException {
        if(n <= 0) throw new IllegalArgumentException("Damn");

        length = n;
    }

    // open site (row, col) if it is not open already
    public void open(int row, int col) throws IllegalArgumentException {
        if(row > length || col > length) throw new IllegalArgumentException("Damn");
    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col) throws IllegalArgumentException {
        if(row > length || col > length) throw new IllegalArgumentException("Damn");

        return false;
    }

    // is site (row, col) full?
    public boolean isFull(int row, int col) throws IllegalArgumentException {
        if(row > length || col > length) throw new IllegalArgumentException("Damn");

        return false;
    }

    // number of open sites
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }

    // test client (optional)
    public static void main(String[] args) {

    }
}
