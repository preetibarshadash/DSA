class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");
        int endSecs = Integer.parseInt(end[0]) * 3600 + Integer.parseInt(end[1]) * 60 + Integer.parseInt(end[2]);
        int startSecs = Integer.parseInt(start[0]) * 3600 + Integer.parseInt(start[1]) * 60
                + Integer.parseInt(start[2]);
        return Math.abs(endSecs - startSecs);
    }
}
