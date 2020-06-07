public class SecondsAndMinutes {

    public static void main(String[] args){
        String time = getDurationString(399,40);
        System.out.println(time);

        String timeInSeconds = getDurationString(99945);
        System.out.println(timeInSeconds);

    }

    public static String getDurationString(long minutes, long seconds){
        if(minutes < 0 || (seconds < 0 || seconds >= 59)) {
            return "Invalid value";
        }
        long hours = minutes/60;
        long extraMinutes = minutes < 60 ? minutes : minutes%60;

        return hours + "hrs " + extraMinutes + " minutes " + seconds + " seconds.";
    }

    public static String getDurationString(long seconds) {
        if(seconds <= 0) {
            return "Invalid value";
        }
        long minutes = seconds/60;
        long remainingSeconds = seconds%60;

        return getDurationString(minutes,remainingSeconds);
    }
}
