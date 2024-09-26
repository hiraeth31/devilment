public class StopWatch {

    private long startTime, endTime;
    public long getStartTime() { return startTime; }
    public long getEndTime() { return endTime; }

    public void start() { startTime = System.currentTimeMillis(); }

    public void end() { endTime = System.currentTimeMillis(); }

    public long getElapsedTime() { return endTime - startTime; }

    public StopWatch() { startTime = System.currentTimeMillis(); }

    public static void bubbleSort(int[] sortArr) // алгоритм взял с сайта с алгоритмами
    {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}
