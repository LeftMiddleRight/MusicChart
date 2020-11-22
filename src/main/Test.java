package main;

import model.MelonAlbumCommentParser;
import model.MelonChartParser;

public class Test {
    public static void main(String[] args) {
        MelonChartParser melon = new MelonChartParser();
        melon.isParsed();
        melon.chartDataParsing(null);
        System.out.println(melon.getAlbumUrl(1));

        MelonAlbumCommentParser com = new MelonAlbumCommentParser();
        com.setAlbumUrl(melon.getAlbumUrl(1));
        com.crawl();

    }
}
