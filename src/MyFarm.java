public class MyFarm {

    // declare
    public Plot[][] grid;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        // declare a 2D grid of plots
        grid = new Plot[5][4];

        // fill a 2D grid of plots
        for(int a = 0; a < grid.length; a++){
            for(int b = 0; b < grid[0].length; b++){
                System.out.println("plating at row " + a +
                        ", column " + b);
                grid[a][b] = new Plot();
                grid[a][b].printPlotInfo();

            }
        }


        // methods to write together during class
        totalPlants();

        totalCarrots();

        averageNumberOfPlants();

        numberOfTomatoPlots();

        everyOtherNeedsWater();

        numberOfEmptyPlots();

        averageColumns();

        averageRows();

        /***
         * for each additional method you code, call it here
         */


    }

    public void totalPlants() {
        // how many plants are there in total across all plots?
        int total = 0;
        for(int a = 0; a < grid.length; a++){
            for(int b = 0; b < grid[0].length; b++){
                total = total + grid[a][b].numberOfPlants;
            }
        }
        System.out.println("total plants " + total);
    }

    public void totalCarrots() {
        // how many total carrots are there across all plots?
        int totalCarrots = 0;
        for(int a = 0; a < grid.length; a++){
            for(int b = 0; b< grid[0].length; b++){
                if (grid[a][b].plantName.equals("carrot")){
                    totalCarrots = totalCarrots + grid[a][b].numberOfPlants;
                }
            }
        }
        System.out.println("Total number of carrots: " + totalCarrots);

    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int totalPlants = 0;
        int totalPlots = 0;

        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                totalPlants += grid[a][b].numberOfPlants;
                totalPlots++;
            }
        }
        double average = (double) totalPlants / totalPlots;
        System.out.println("Average number of plants per plot: " + average);

    }

    public void numberOfTomatoPlots() {
        // how many plots have carrots on them?
        int tomatoPlots = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName.equals("tomato")) {
                    tomatoPlots++;
                }
            }
        }

        System.out.println("Number of tomato plots: " + tomatoPlots);
    }

    public void numberOfEmptyPlots() {
        // how many plots are empty?
        int emptyPlots = 0;

        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName.equals("empty")) {
                    emptyPlots++;
                }
            }
        }
        System.out.println("Number of empty plots: " + emptyPlots);

    }

    public void everyOtherNeedsWater() {
        // change the value of needsWater to be true for every other plot
        // print the value or needs water for all plots row by row
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if ((a + b) % 2 == 0) {
                    grid[a][b].needsWater = true;
                }
                System.out.print(grid[a][b].needsWater + " ");
            }
            System.out.println();
        }
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?


    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
            }
        }
    }

    public void greaterThan50() {
        // how many plots have more than 10 plants in the plot?
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
            }
        }
    }

    public void plantWithMaxNumberNeedsWater() {
        // which plant type has the most total plants (not counting empty plots) that needs water?
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
            }
        }
    }


    /***
     * more challenging
     */


    public void averageRows() {
        // find the average number of plants for every row
        // place the average of every row into a new array
        double[] rowAverages = new double[grid.length];

        for (int a = 0; a < grid.length; a++) {
            int rowSum = 0;
            for (int b = 0; b < grid[0].length; b++) {
                rowSum += grid[a][b].numberOfPlants;
            }
            rowAverages[a] = (double) rowSum / grid[0].length;
            System.out.println("Average number of plants in row " + a + ": " + rowAverages[a]);
        }
    }

    public void averageColumns() {
        // find the average number of plants for every col
        // place the average of every row into a new array
        double[] columnAverages = new double[grid[0].length];

        for (int b = 0; b < grid[0].length; b++) {
            int columnSum = 0;
            for (int a = 0; a < grid.length; a++) {
                columnSum += grid[a][b].numberOfPlants;
            }
            columnAverages[b] = (double) columnSum / grid.length;
            System.out.println("Average number of plants in column " + b + ": " + columnAverages[b]);
        }
    }

    public void updateNeedsWater() {
        // if 2 or more of the adjacent plots need water (left, right, up, down),
        // make the current plot needs water to be true
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
            }
        }
    }


    /***
     * most challenging
     */


    public void greatestDifferenceNumberBetweenAnyAdjacentPlants() {
        // of every pair of adjacent plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right),
        // which two have the greatest difference in plant numbers?
        // what is that difference?

    }

    public void updateNumberOfPlants() {
        // change the value of number of plants so it is the average of the 8 surrounding plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right)
    }

    public void numberOfCarrotPlotsNextToCorn() {
        // how many carrot plots share a border with a corn plot?

    }

}
