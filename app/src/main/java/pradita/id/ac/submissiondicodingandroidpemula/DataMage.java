package pradita.id.ac.submissiondicodingandroidpemula;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.model.Mage;

public class DataMage {

    private static String[] nama_mage = {
            "Diao Chan",
            "D' Arcy",
            "Liliana",
            "Tulen",
            "Sephera",
            "Lauriel",
            "Krixi",
            "Ilumnia",
            "Raz",
            "Aleister",
            "Veera",
            "Ignis",
            "Preyta",
            "The Flash",
            "Jiina",
            "Natalya",
            "Mganga",
            "Marja",
            "Azzen'Ka"
    };

    private static String[] role_mage = {
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage",
            "Mage"
    };

    private static String[] kisah_mage = {
            "Diao Chan berusia 18 tahun. Dia baru saja mempelajari seni Sleeve Dancing dan dengan seni tersebut ia berhasil merayu semua lelaki yang sering mengunjungi Chang'an Avenue. Diao Chan memang sangat cantik, namun kecantikannya juga disertai dengan sikapnya yang manipulatif",
            "Tembok Besar Norman berdiri di perbatasan selatan kerajaan layaknya urat nadi naga raksasa. Sebagai salah satu keajaiban dunia peradaban manusia, tembok itu berhasil menggagalkan banyak serangan dari Beast atau Abyss, dan membuat sang pencipta, D'Arcy, dikukuhkan sebagai penyelamat. Namun saat ini, sang penyelamat mengalami sedikit masalah. Lengan kanannya seringkali kesakitan di tengah malam setiap hari – sakitnya bukan sekedar sakit fisik, melainkan sakit batin, seakan terkoyak-koyak. Semenjak kembali dari Void ke Athanor, lengan kanan D'Arcy dijangkiti rasa sakit yang aneh dan menusuk",
            "Sebagai salah satu sosok makhluk paling kuno di Athanor, Liliana terlahir saat dunia masih diselimuti Kekacauan dan semua makhluk hidup hanya mampu bertahan hidup memanfaatkan naluri mereka. Dipenuhi rasa penasaran, Liliana mengukir jejaknya di dunia yang kacau itu, terus mencari inti dari alam semesta dan sumber kekuatan. Dia ingin mencari tahu tentang masa lalu dan masa depan, awal kehidupan dan makna kematian. Demi mewujudkannya, Liliana bertransformasi menjadi wujud berbeda dan menyaksikan jalannya kehidupan dari sudut panjang berbeda",
            "Tulen adalah seorang demigod yang lahir dari panggilan petir dan kilat. Dia adalah anak yang luar biasa, mampu mengendalikan petir dan kilat sesuai perintahnya. Petir yang diciptakan Tulen seribu kali lebih kuat dari sihir biasa. Beberapa orang menyebutnya seperti dewa",
            "Di tengah sungai, berdiri sebuah patung megah dari Sephera, sang penyihir legendaris, pendiri Dewan Magister, Guru Besar Akademi, dan sosok yang seorang diri menciptakan Miracle of Losarth. Pertemuan pertama Sephera dengan ilmu sihir bersumber dari serdadu sihir yang mengabdi pada keluarganya. Banyak bangsawan yang memperkerjakan serdadu sihir, yang mereka beri upah dan penghidupan agar bersedia melindungi keluarga dan lahan kepemilikan mereka",
            "Lauriel adalah penjaga Temple of Light dan pemimpin spiritual para pengikut. Dia dengan taat mematuhi perkataan the Great Ones dan karenanya dianugerahi kekuatan luar biasa. Ketulusan iman Lauriel memberinya kekuatan tak tertandingi dan, untuk sesaat, memegang kendali atas kekuatan reinkarnasi. Saat berperang melawan pasukan The Fallen, para pengikut pernah menyaksikan Lauriel melebarkan sayapnya dan menerjang pasukan musuh",
            "Seperti peri lainnya, Krixi dapat ditemukan sedang berdansa di antara bunga atau bermain dengan hewan. Namun, ketika datang bahaya, sisi jahat Krixi akan muncul. Dengan gigi taring dan cakar yang tajam. Namun Krixi paling sedih ketika manusia yang dianggapnya teman, justru merusak hutan demi uang. Tentara manusia sangat kuat dan rapi, sehingga Krixi memanggil kekuatan hutan untuk melindungi diri dan melawan manusia. Usahanya berhasil, manusia akhirnya menandatangani perjanjian damai",
            "Ilumia memiliki segalanya: kecantikan, kepandaian, kekuasaan, kejayaan, dan kekuatan.  Ilumia adalah penjelmaan terang, tidak ada Hero yang dapat menyaingi Ilumia. Dia tidak pernah menunjukkan diri sesungguhnya kepada siapapun, karena dia memikul jati diri yang lebih penting yaitu sebagai Dewi Cahaya",
            "Pernah dijual sebagai Gladiator menjanjikan pada The Fallen, Raz merupakan sosok penting yang disembunyikan Thane di Demon Abyss. Bakat luar biasa Raz dengan tinjunya dengan cepat membuatnya mendapat pengakuan Preyta the Plague Rider dan rekan-rekannya. Berkat rasa hormat yang ditujukan orang-orang pada dirinya, dia mampu menjadi pemimpin yang disegani Gladiator Rebellion",
            "Orang mungkin lupa bahwa Aleister, Si Penjahat Hina, pernah menjadi kandidat anggota Temple of Light. Bersama Yorn sang Jawara, mereka dipuji sebagai Sons of Light dan paling berpotensi untuk direkrut secara langsung menjadi anggota Temple. Namun disamping kecerdasannya, Aleister tidak memiliki tekad yang kuat dan ia pun jatuh dalam kegelapan karena pesona Veera.  Meskipun begitu, kecerdikan Aleister selalu memiliki dampak besar pada perang. Trik tak berujung dan perangkap telah membantu pasukan the Fallen mengalahkan pasukan lawan dari waktu ke waktu",
            "Buku kuno mengisahkan bahwa Veera adalah utusan the Great Ones yang paling taat dan kuat. Bertekad untuk membuktikan keberaniannya, dia coba menghadapi the Ravagers seorang diri. Tentu saja jika dia berhasil menaklukkannya, the Great Ones akan memberikan kejayaan padanya. Namun, sepertinya keangkuhan itu tidak disukai the Great Ones. Walalupun dia bertarung dengan berani dan gigih, pada akhirnya dia tertangkap juga",
            "Doktrin Temple of Light mengajarkan bahwa Api Suci merupakan simbol cahaya dan kebenaran. Sebagai pelindung Api Suci, Ignis telah sejak lama mengandalkan pengetahuannya yang luas dan keyakinannya yang kuat untuk memimpin umat menuju jalan cahaya. Karena inilah, dia dikenal sebagai Sang \"Penuntun.\" Terobsesi mengejar kebenaran, Ignis menghabiskan hidupnya mempelajari Tower of Contemplation dari Kuil itu. Dia membaca banyak teks kuno, dan menemukan mantera manipulasi Holy Flame yang lama terlupakan",
            "Lahir dari pertempuran, Plague Rider hidup untuk menyebarkan wabah penyakit. Pada saat konflik kuno antara Forgotten Kingdoms, mayat-mayat mulai menumpuk tinggi. Preyta adalah tentara yang ditugaskan menjaga daerah ini. Namun, seiring dengan bertambahnya tumpukan mayat, kebusukan abadi dan mayat-mayat bernanah menumbuhkan sesuatu yang lain. Jiwa Preyta terinfeksi, pikirannya berubah dan berputar sampai semua yang tersisa membuatnya menjadi hamba dari wabah penyakit. Diperkuat oleh kebusukan, The Plague Rider lahir",
            "Barry Allen selalu bergerak dengan sangat cepat—tak ada yang mampu mengurangi kecepatannya. Hal itu berubah saat ibunya mati terbunuh. Dulu, Barry adalah sesosok anak hiperaktif yang membuat gurunya kewalahan. Namun sekarang, semua energi Barry dikerahkan untuk mencari pembunuh sesungguhnya dari ibunya. Kehidupannya berubah saat sebuah petir menyambar laboratoriumnya, dan Barry pun diilhami kekuatan kecepatan super, hingga menjadi sosok the Flash. Berkat kemampuannya untuk berlari dengan kecepatan nyaris mendekati kecepatan cahaya, Barry menemukan sensasi yang memacu adrenalinnya. Melalui tekad dan konsentrasi, the Flash mampu mempelajari cara bergerak menembus benda, menciptakan dentuman sonik hanya dengan menjentikkan jemarinya dan selalu unggul saat beradu kecepatan",
            "The Blood Orb, pusaka keluarga yang rapuh namun kuat, melindungi keluarga Jinna namun menempatkan mereka dalam bahaya. Leluhur Jinna semata-mata mengandalkan kekuatan Orb itu untuk melindungi diri mereka sendiri dan mengalahkan iblis dari Neraka. Demi menyegel Orb, mempertahankan kemurniannya, dan menyatukan diri mereka dengan benda itu, leluhur Jinna mengorbankan jiwa mereka untuk Orb tersebut demi melindungi generasi di masa depan dan berusaha untuk mengamankan diri mereka. Jinna membawanya dalam perjalanan menuju Temple of Light, sebuah tempat berlindung yang dirasa menjadi lokasi paling aman untuk menyimpan Orb itu. Dalam perjalanan menuju kuil, sisa kegelapan dalam Orb memancarkan energi kegelapan hingga Neraka, yang menarik perhatian Maloch, the Thunder Demon. Seketika, Jinna tertangkap pasukan anak buahnya. Di masa kritis, kalah jumlah dan terluka, Jinna yakin sudah tak ada lagi harapan dan tak ada gunanya melawan… Hingga muncul sesuatu yang terjaga dalam Orb tersebut",
            "Saat the Fallen menyerang, sekelompok pengikut setia Temple of Light bersedia dijangkiti Poison Fang, sejenis parasit, berubah menjadi kesatria abadi yang melindungi tempat suci mereka dari the Fallen seraya membawa kutukan yang abadi dan kejam. Inang Poison Fang tak bisa dibunuh, dan parasit itu dapat diwariskan ke keturunan mereka hingga banyak generasi. Oleh karena itu, Natalya, keturunan dari para kesatria ini, juga dihinggapi parasit ini. Natalya ternyata adalah penerus terbaik yang pernah ada di Kuil itu",
            "Nalurinya yang kasar dan ambisi akan kekuasan membuat Mganga sangat ahli dalam sihir kegelapan. Mganga menangkap makhluk liar yang kuat dan menukar mereka dengan kekuatan sihir kegelapan. Mganga menghabisi mereka dalam gua tempat tinggalnya atau menggantung mereka pada pohon, di sana Mganga terus melatih kemampuan sihirnya dan berkomunikasi dengan kekuatan kegelapan hingga kekuatan sihirnya tak terkalahkan",
            "The Champion Maiden of the Veda, Sang Penyihir yang sangat mumpuni, Murid terbaik Edras, Sang Penyihir Veda semua itu menggambarkan jati diri Marja dan dia pun dipuja karenanya. Bahkan Volkath pun, tawanan Edras, sudi mengesampingkan prasangka buruk serta kebenciannya terhadap Veda demi menjalin asmara dengan Marja. Pemberani dan cerdik, Volkath tak menemui kesulitan berarti saat mendekati Marja. Walaupun banyak yang sulit menerima hubungan mereka, namun tak menghalangi keduanya untuk saling jatuh cinta. Sayangnya, tak satupun yang memberi restu hubungan itu dan bahkan banyak yang berharap tak berlangsung lama, semata karena mereka memiliki latar belakang dan pola pikir yang benar-benar berlawanan",
            "Sosok yang misterius, Azzen'Ka menghuni gurun dan dipuja layaknya dewa oleh segelintir orang. Siapapun yang ingin melewati gurun harus memberikan persembahan pada dirinya atau bersiap untuk tersesat selamanya. Medan yang berbahaya telah mengasingkan gurun itu dari dunia, dan badai tiada henti telah mencegah dewa lain memasuki tempat itu, membuat Azzen'Ka menjadi penguasa gurun yang sesungguhnya. Sejumlah berkas menggambarkan Azzen'Ka sebagai sosok yang jahat. Namun, banyak pengembara yang mengatakan bahwa Azzen'Ka akan menjamin keselamatan mereka selama mereka memberikan persembahan padanya"
    };

    private static int[] gambarHeroMage = {
            R.drawable.diochan,
            R.drawable.darcy,
            R.drawable.liliana,
            R.drawable.tulen,
            R.drawable.sephera,
            R.drawable.lauriel,
            R.drawable.krixi,
            R.drawable.ilumnia,
            R.drawable.raz,
            R.drawable.aleister,
            R.drawable.veera,
            R.drawable.ignis,
            R.drawable.preyta,
            R.drawable.flash,
            R.drawable.jiina,
            R.drawable.natalya,
            R.drawable.mganga,
            R.drawable.marja,
            R.drawable.azzenka,
    };

    static ArrayList<Mage> getListData() {
        ArrayList<Mage> listMage = new ArrayList<>();
        for (int position = 0; position < nama_mage.length; position++) {
            Mage mage = new Mage();
            mage.setHero_mage(nama_mage[position]);
            mage.setRole_mage(role_mage[position]);
            mage.setKisah_mage(kisah_mage[position]);
            mage.setGambarMage(gambarHeroMage[position]);
            listMage.add(mage);
        }
        return listMage;
    }
}
