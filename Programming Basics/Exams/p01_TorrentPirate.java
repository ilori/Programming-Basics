import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p01_TorrentPirate {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int downloadData = Integer.parseInt(console.nextLine());
        int cinemaMoney = Integer.parseInt(console.nextLine());
        int moneyPerHour = Integer.parseInt(console.nextLine());
        double downloadTime = downloadData / 2.0 / 60.0 / 60.0;
        double timeInMall = downloadTime * moneyPerHour;
        double moviesDownloaded = downloadData / 1500.0;
        double cinemaPrice = moviesDownloaded * cinemaMoney;
        if(cinemaPrice >= timeInMall)
        {
            System.out.printf("mall -> %.2flv",timeInMall);
        }else{
            System.out.printf("cinema -> %.2flv",cinemaPrice);
        }
    }
}
