import java.util.List;

public class Calculator {

    private Calculator() {}

   public static double calculate(List<MediaItem> mediaItems) {
            int items = 0;
        for (MediaItem item : mediaItems){
        if (item instanceof Movie){
            Movie movie = (Movie) item;
            items += item.getRuntime();
        }  else if (item instanceof Series){
            Series series = (Series) item;
               items += series.getRuntime() * series.getSeriesCount();
           }
        }
        return ((double) items) / 60 / 24;
    }
}
