class SimpleStartup {
    private int[] locationCells;
    private int  numOfHints = 0;

    public void setLocationCells(int[] locs ){
        locationCells = locs;
    }
    public String checkYourself(int guess) {
        String result = "miss";
        for (int cell : locationCells){
            if (guess == cell){
                result = "hit";
                numOfHints++;
                break;

            }
        }
        if (numOfHints == locationCells.length){
                result = "kill";

            }
            System.out.println(result);
            return result;
    }
}
