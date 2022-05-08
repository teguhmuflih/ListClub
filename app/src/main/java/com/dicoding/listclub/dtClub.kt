package com.dicoding.listclub

class dtClub {
    private val listClubName = listOf(
        "The Arsenal Football Club",
        "Aston Villa Football Club",
        "Chelsea Football Club",
        "Liverpool Football Club",
        "Manchester City Football Club",
        "Manchester United",
        "Tottenham Hotspur Football Club",
        "Everton Football Club",
        "Fulham Football Club",
        "Southampton Football Clu"
    )

    private var listPoster = listOf(
        R.drawable.arsenal,
        R.drawable.aston_villa,
        R.drawable.chelsea,
        R.drawable.liverpool,
        R.drawable.man_city,
        R.drawable.man_united,
        R.drawable.tottenham_hotspur,
        R.drawable.everton,
        R.drawable.fulham,
        R.drawable.southampton
    )

    private val listCoach = listOf(
        "Mikel Arteta",
        "Steven Gerrard",
        "Thomas Tuchel",
        "Jurgen Klopp",
        "Pep Guardiola",
        "Ralf Rangnick",
        "Antonio Conte",
        "Frank Lampard",
        "Roy Hodgson",
        "Ralph Hasenhüttl"
    )

    private val listNickname = listOf(
        "The Gunners, The Arsenal",
        "The Villans, The Lions, The Claret & Blue Army",
        "The Blues",
        "The Reds",
        "The Citizens",
        "The Red Devils",
        "The Lilywhites",
        "The Blues, The Toffees, The People’s Club",
        "The Cottagers, The Whites, The Lillywhites",
        "The Saints"
    )
    private val listEstablished = listOf(
        "Oktober 1886",
        "1874",
        "10 Maret 1905",
        "1892",
        "1880",
        "1878",
        "5 September 1882",
        "1878",
        "1879",
        "21 November 1885"
    )
    private val listStadium = listOf(
        "Emirates Stadium",
        "Villa Park",
        "Stamford Bridge",
        "Anfield",
        "City of Manchester Stadium",
        "Old Trafford",
        "Tottenham Hotspur Stadium",
        "Goodison Park",
        "Craven Cottage",
        "St Mary's Stadium"
    )
    private val listDescription = listOf(
        "Arsenal adalah klub pertama dari Inggris Selatan yang bergabung dengan Football League pada tahun 1893, dan mereka mencapai Divisi Pertama pada tahun 1904. Terdegradasi hanya sekali, pada tahun 1913, mereka melanjutkan rekor terpanjang di divisi teratas, dan telah memenangkan gelar kedua.",
        "Aston Villa Football Club dibentuk pada Maret 1874, oleh anggota Villa Cross Wesleyan Chapel di Handsworth yang sekarang menjadi bagian dari Birmingham. Villa adalah salah satu anggota pendiri Liga Premier pada tahun 1992, menjadi salah satu dari hanya tiga klub yang telah menjadi anggota pendiri Liga Sepak Bola pada tahun 1888 dan Liga Premier, bersama dengan Blackburn Rovers dan Everton.",
        "Chelsea hanya memiliki satu kandang, Stamford Bridge, tempat mereka bermain sejak berdirinya tim. Stadion ini resmi dibuka pada 28 April 1877 dan selama 28 tahun berikutnya digunakan oleh London Athletic Club sebagai arena pertemuan atletik. Stamford Bridge mengalami banyak renovasi terutama penambahan kompleks perhotelan. Stamford Bridge mampu menampung 40.834 penonton dalam sekali tanding.",
        "Liverpool Football Club didirikan pada 15 Maret 1892 oleh John Houlding, pemilik Anfield. Houlding memutuskan untuk membentuk tim sendiri setelah Everton FC dikeluarkan dari Anfield dalam perselisihan mengenai biaya sewa. Awalnya klub baru itu bernama Everton FC namun diganti ke Liverpool FC setelah Asosiasi Sepak Bola Inggris menolak penggunaan nama tersebut.",
        "Manchester City Football Club merupakan club sepakbola Inggris yang berbasis di Manchester. Grup ini dibentuk tahun 1880 dengan nama West Gorton. Pada tahun 1887 mereka beralih nama jadi Ardwick A.F.C. , dan akhirnya berganti lagi jadi Manchester City F.C. di tahun 1894.",
        "Manchester United F.C., biasa disingkat Man United atau hanya Man U (MU), adalah sebuah klub sepak bola Inggris yang berbasis di Old Trafford, Manchester. Dibentuk sebagai Newton Heath LYR F.C. pada 1878 sebagai tim sepak bola depot Perusahaan Kereta Api Lancashire dan Yorkshire Railway di Newton Heath, namanya berganti menjadi Manchester United pada 1902.",
        "Tottenham Hotspur Football Club, biasa disebut Tottenham atau Spurs, adalah klub sepak bola profesional Inggris yang berbasis di Tottenham, London, yang bersaing di Liga Premier sepak bola Inggris. Klub yang memiliki lambang ayam jantan ini mengenakan kemeja putih dan perlengkapan kandang celana pendek biru laut sejak musim 1898–99.",
        "Everton Football Club adalah klub sepak bola asosiasi profesional Inggris yang berbasis di Liverpool yang saat ini bersaing di Premier League, tingkat teratas sepak bola Inggris. Everton dibentuk pada tahun 1878, Everton memenangkan League Championship pertama mereka selama musim 1890-91.",
        "Fulham Football Club (FFC) atau yang biasa disebut sebagai Fulham merupakan tim sepakbola yang berbasis di Fulham, London. Club ini didirikan pada 1879, dan tahun ini club ini merayakan ulang tahun ke 126 tahunnya. FFC yang bermula sebagai tim sepakbola sekolah minggu dengan nama Fulham St. Andrew's ini mendapat status tim profesional pada 12 Desember 1898.",
        "Southampton Football Club adalah klub sepak bola profesional Inggris yang berbasis di Southampton, Hampshire, yang bermain di Liga Premier sepak bola Inggris. Salah satu anggota pendiri Liga Premier, mereka telah menghabiskan sebagian besar sejarah mereka di papan atas sejak promosi pertama mereka pada tahun 1966."
    )

      fun getClub() : ArrayList<Club>{
        val listClub = ArrayList<Club>()

        for(position in listClubName.indices){
            val club = Club(
                clubName = listClubName[position],
                coach = listCoach[position],
                stadium = listStadium[position],
                established = listEstablished[position],
                nickName = listNickname[position],
                description = listDescription[position],
                poster = listPoster[position],
                player = getPlayer(position+1)
            )

            listClub.add(club)
        }
        return listClub
    }

    private fun getPlayer(position:Int): ArrayList<ClubPlayer>{
        return when(position){
            1 -> dtPlayer.arsenalPlayer
            2 -> dtPlayer.astonvillaPlayer
            3 -> dtPlayer.chelseaPlayer
            4 -> dtPlayer.liverpoolPlayer
            5 -> dtPlayer.cityPlayer
            6 -> dtPlayer.muPlayer
            7 -> dtPlayer.tottenhamPlayer
            8 -> dtPlayer.evertonPlayer
            9 -> dtPlayer.fulhamPlayer
            10 -> dtPlayer.southamptonPlayer
            else -> ArrayList()
        }
    }

}