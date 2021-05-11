package com.example.fragment;

import java.util.ArrayList;

public class MoviesData {
    private static String[] movieNames = {
            "Stand By Me 2",
            "Raya and the Last Dragon",
            "Onward",
            "Sonic the Hedgehog",
            "The Incredibles",
            "I Lost My Body",
            "Big Hero",
            "Spongebob on movie",
            "Upin-Ipin Keris Siamang Tunggal",
            "Ninja Hatori",
            "Coco",
            "Toy Story 4"
    };

    private static String[] movieDetails = {
          "Nobita menuju ke masa depan, tepat di mana merupakan momen spesial dalam kehidupannya yaitu pernikahan",
            "Dengan berlatar belakang di sebuah negeri fantasi bernama Kumandra, penonton diajak untuk berpetualangan",
            "Petualangan Fantasi Demi orang terkasih",
            "Menceritakan seorang Sheriff kota kecil kernama Tom Wachowski",
            "Keluarga pahlawan super yang menjalani hidup layaknya seperti orang biasa",
            "Mengisahkan tentang sepotong tangan milik seorang pemuda bernama Naofel",
            "Seorang pemuda jenius 14 tahun bernama Hiro Hamada yang berhasil menciptakan robot sahabat",
            "Hilangnya resep Krabbt Patty",
            "Pertama kalinya Upin & Ipin terpisah untuk berpetualang di dua tempat yang berbeda",
            "Mengisahkan tentang kehidupan ninja antara adik dan kakak",
            "Kisah Miguel Rivera seorang anak berusia 12 tahun yang tinggal bersama neneknya bernama Coco",
            "mainan Woody, Buzz Lightyear dan teman-temannya tinggal bersama pemiliki baru yang bernama Bonnie"
    };

    private static int[] movieImages = {
            R.drawable.stand_by_me,
            R.drawable.raya,
            R.drawable.onward,
            R.drawable.sonic,
            R.drawable.the_incredibles,
            R.drawable.lost_boy,
            R.drawable.big_hero,
            R.drawable.spongebob,
            R.drawable.upin_ipin,
            R.drawable.ninja_hatori,
            R.drawable.coco,
            R.drawable.toy_story
    };

    static ArrayList<MovieModel> getListData(){
        ArrayList<MovieModel> list = new ArrayList<>();
        for (int position = 0; position < movieNames.length; position++){
           MovieModel moviemodel = new MovieModel();
           moviemodel.setName(movieNames[position]);
           moviemodel.setDetail(movieDetails[position]);
           moviemodel.setPhoto(movieImages[position]);
           list.add(moviemodel);
        }
        return list;
    }
}
