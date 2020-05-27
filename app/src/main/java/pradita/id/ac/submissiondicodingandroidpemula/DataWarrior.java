package pradita.id.ac.submissiondicodingandroidpemula;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.model.Warrior;

public class DataWarrior {

    private static String[] heroWarrior = {
            "Florentino",
            "Yena",
            "Omen",
            "Zukka",
            "Richter",
            "Veres",
            "Ryoma",
            "Kil'groth",
            "Maloch",
            "Wonder Woman",
            "Wiro Sableng",
            "Roxie",
            "Max",
            "Lubu",
            "Amily",
            "Astrid",
            "Arduin",
            "Superman",
            "Arthur",
            "Taara"
    };

    private static String[] roleHeroWarrior = {
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior",
            "Warrior"
    };

    private static String[] storyHeroWarrior = {
            "Sebagai satu-satunya penerus House of Perfume, petualangan romantis Florentino begitu dikenal, sama halnya seperti pesta mewahnya. Melihat reputasi House of Perfume yang terkenal dalam bidang bela diri, gaya hidup mewah Florentino banyak dicibir sudah terlalu banyak orang yang menganggapnya sebagai bocah manja yang tak mampu memanfaatkan kekayaan yang dikaruniakan pada dirinya. Florentino sendiri tak mempedulikan pandangan orang. Sudah sedari dulu dia menyadari bahwa dirinya berbeda dengan orang kebanyakan",
            "Saat mereka yang berkumpul bersukacita, Yena adalah satu-satunya yang tetap tenang dan tanpa perasaan. Mole Revolusioner di Kuil melakukan tugas-tugas barunya sebagai pendeta kuil, doa dan tarian yang dipersembahkan kepada dewa mereka. Sebagai seorang Reformis berpendidikan Kerajaan, Yena tahu betul apa yang diwakili oleh pecahan itu. Gudang harta kekaisaran dikosongkan ketika kekaisaran digulingkan, tetapi kaum Revolusioner tidak menemukan dua hal yang paling penting bagi mereka - selamat dari keluarga kerajaan, dan Andura Shards",
            "Omen, the Insatiable, merupakan mesin pembunuh tersadis. Ia lahir di lembah terdalam dari neraka tempat tinggal para monster, tempat yang dingin dan hampa seperti dirinya. Bahkan para monster yang tinggal di lembah tersebut sangat takut dan menjauhinya. Meskipun demikian, Omen jarang terlbiat dalam pertempuran. Omen memiliki hasrat menghancurkan yang amat dahsyat sehingga akan membunuh semua yang ada, bukan hanya musuh-musuhnya, namun juga teman dan prajuritnya sendiri",
            "Zuka lahir di desa yang indah dan damai, tempat dimana orang dapat menghindari kekejaman dan ketidakadilan yang banyak terjadi di belahan dunia lain. Penduduk desa ini amat menghargai seni bela diri, dan sejak kecil Zuka telah mempelajari segala jenis seni bela diri dan menjadi semakin tangguh setelah melalui berbagai tes yang diberikan gurunya. Kisah kepahlawanan Zuka menyebar ke seluruh dunia, dari Temple of Light yang mulia, hingga Castle of Inception yang dulunya mencurigai makhluk buas, semua akhirnya mengakui kepahlawanan Zuka. Bahkan Ratu Peri Tel'Annas menyiapkan pesta penyambutan yang spesial untuknya. Atas undangan the Earth Elemental Lumburr, Zuka secara resmi bergabung dengan prajurit cahaya yang bertugas melawan seluruh kejahatan di muka bumi",
            "Sebagai mantan Demon Hunter, Richter biasa melawan dengan Iblis yang sesungguhnya bersama teman-temannya. Kelompok prajurit super ini telah dimodifikasi dengan Abyssal Essence, yang secara signifikan meningkatkan kekuatan dan stamina masing-masing ke level yang lebih tinggi. Dengan demikian, para prajurit dapat menghadapi Iblis secara langsung",
            "Darah Veres memasuki bebatuan. Sebuah cahaya merah tua memancar melewati ukiran layaknya ular lapar yang mencari mangsa. Inilah pengorbanan sihir yang paling berbahaya yaitu menggunakan batu Rune mengandung sihir kegelapan sebagai perantara, sang pemanggil mengaktifkannya dengan kekuatan darah, memanggil bayangan sesosok \"tamu\" dari alam lain. Ini merupakan ujian untuk jiwa dan raga. Tamu dari Abyss telah tiba. Suara yang menawan bergema, namun Veres tetap fokus. Dia menarik pergelangan tangannya yang berdarah dan membalutnya sebaik mungkin dengan tangan dan mulutnya",
            "Sebagai keturunan seorang samurai, Ryoma tak hanya berlatih keras, namun juga mempelajari strategi militer. Di sebuah kamp pelatihan di mana kekuatan menjadi segalanya, dia muncul menjadi yang terbaik. Ryoma merupakan sosok yang pemalu semasa kecil. Apalagi dirinya gemar belajar taktik militer, tak pelak membuatnya jadi sasaran perundungan. Namun Kondo selalu melindunginya, kondo berguru pada ayah Ryoma dan ingin menunjukkan balas budi atas kebaikan yang telah diberikan keluarga Ryoma pada dirinya. Dengan Kondo sebagai panutan, Ryoma pun tumbuh menjadi samurai seperti ayahnya",
            "Kil'Groth adalah penguasa lautan, dimana amarah adalah jalan satu-satunya untuk bertahan hidup. Berusaha bertahan hidup adalah hukum alam yang normal, namun fanatisme Kil'Groth berakar dari sikap masa bodoh terhadap keseimbangan rantai makanan. Satu-satunya hal yang dipedulikannya adalah menanamkan amarah pembunuh kepada semua makhluk laut. Mengenai apa yang mereka bunuh, terserah mereka. Pembantaian tanpa henti merupakan sumber kekuatan amarah Kil'Groth. Darah segar yang tersebar di lautan membangunkan kumpulan predator laut dalam yang lalu mengisi kekosongan di rantai makanan",
            "Dari neraka terdalam tempat penyiksaan dan penderitaan abadi, Maloch bangkit menjadi penguasa Ravenors. Ia tahu hukuman dan penyiksaan paling menyakitkan yang ada di seluruh dunia. Maloch menghancurkan apa saja yang ditemuinya dan teriakan mereka adalah musik dan sumber kekuatan baginya. Di Ravenors, tempat dimana tidak ada cahaya, semua korban Maloch menjadi pelayannya . Kekejaman Maloch tak terbatas dan dengan senang hati ia menyiksa seluruh Ravenors",
            "Wonder Woman adalah Putri Diana dari bangsa Amazon yang abadi di mitologi Yunani. Saat pilot militer Steve Trevor terdampar di pulau surga Amazon yang terpencil, Diana ditugaskan mengantarkan Steve pulang kembali dan membuat bangsanya dikenal dunia. Memasuki dunia peradaban manusia yang dingin untuk pertama kalinya, Diana menemukan bangsa yang membutuhkan figur pahlawan. Seiring waktu, gaya hidup manusia menyakiti hati Diana. Seorang pejuang dari lahir yang terlatih, Wonder Woman menumpas kejahatan dan berharap untuk membuka potensi kemanusiaan yang tidak selalu ia mengerti - dan inilah misi yang mendorongnya untuk bekerjasama dengan Justice League",
            "Wiro dikenal sebagai \"Hero sableng\". Ada yang menyukai keberaniannya namun ada juga yang membenci kesablengannya. Yah, Wiro masa bodoh dengan hal itu. Dia hanya ingin menikmati hidup dan petualangan dengan caranya sendiri. Walaupun pembawaan Wiro seringkali mengganggu mereka yang berniat jahat, namun hanya sedikit yang menganggap Wiro sebagai musuh sesungguhnya, terutama para jendral yang memiliki pasukan. Wiro telah melalui banyak petualangan melegenda dan aksi heroiknya menjadi kisah yang populer",
            "Roxie berasal dari garis keturunan penjelajah yang termahsyur bahkan sebagian dari pendahulunya, dikenal atas jasa dalam penggalian sumber daya mineral yang membawa kekayaan dan kemakmuran ke Mildar. Keluarganya yang ceria (dan tentunya sedikit tidak waras) seharusnya bisa saja bersantai dan menikmati kehidupan yang makmur, namun hasrat untuk berpetualang yang mengalir di darah mereka nampaknya memang tak mampu terbendung lagi. Roxie, yang masih belia dan penuh imajinasi, percaya sepenuhnya. \"Akan tiba hari dimana aku bertualang seorang diri dan bertemu Pangeranku,\" sebuah deklarasi yang senantiasa diucapkannya. Hari-harinya dihabiskan untuk memimpikan petualangannya di masa mendatang, di mana dia berpetualang hingga ke ujung dunia dan menemukan pusaka berharga dan harta karun mistis ditemani sosok lelaki tegap pemberani. Nyatanya, Roxie tak kunjung bertemu Pangeran dambaannya—sebuah kenyataan yang harus diterimanya. Alih-alih, yang ditemukannya adalah rekan berpetualang yang usil dan sangat menyebalkan, yaitu roh api bernama Agnie",
            "Max menjalani hidup yang keras. Ayahnya meninggal dalam perang sebelum ia lahir dan ibunya bekerja keras hingga meninggal untuk menghidupi anaknya seorang diri. Tanpa uang sepeserpun dan kemampuan yang bisa dibanggakan, Max hanya bisa bergelandang di jalan. Dia menghabiskan waktunya di sekitar pabrik penghasil limbah terbesar milik Moren. Di saat yang bersamaan, Moren masih terperangkap dalam bayang-bayang kebangkitan Skud. Hasil karyanya tidak sukses dan membuatnya membuang banyak mesin mesin tak berharga layaknya sampah. Sampah inilah yang menjadi sumber pendapatan untuk Max, yang kemudian menginspirasi dia menjadi penemu",
            "Duduk di atas kudanya yang dahsyat, Red Fury, Lu Bu memandang rendah musuh-musuhnya, yang tumbang dan bergetar ketakutan, dan menyadari bahwa mereka sangat lemah. Dia tidak bisa memendam kemarahannya lebih lama lagi. Kemenangan seperti ini tidak berarti apa-apa baginya. Apa yang ia inginkan adalah pertarungan yang serius dengan musuh yang sepadan. Tidak ada hal lain yang lebih ia sukai selain mendorong dirinya sendiri ketika dalam bahaya, dan itu adalah awal bagaimana ia dikenal sebagai \"Raja Peperangan Tiada Tara. \" Lu Bu jarang menunjukkan sisi lembutnya saat ia bersinar dalam kilauan baju zirahnya. Diao Chan yang mempesona tersenyum manis, dan mengeluarkan surat dari lengan bajunya. Lu Bu tidak bisa menyembunyikan gairah di matanya ketika dia melihat Diao Chan untuk pertama kali",
            "Amily merupakan seorang pengkhianat, di ujian terakhirnya, dia bekerja sama dengan tiga kandidat lain dan membunuh lebih dari sepuluh pengawas, termasuk sang instruktor. Keempat pengkhianat itu harus membayar mahal dan akhirnya bermandikan darah. Amily sesungguhnya tak perlu melakukan itu. Dia bisa saja menjadi pembunuh teratas selanjutnya di \"Hands of Shadow\" hanya dengan mematuhi perintah organisasi dan membunuh saingannya dalam ujian",
            "Saat Astrid berlutut di hadapan Thane dan mengucap sumpah, umurnya bahkan belum menginjak 18 tahun. Namun, sebagai pemilik pedang melegenda, \"Embertrail\", dan penerus sah dari Duke of Roses, Astrid bersedia mengenakan jubah yang dibebankan pada dirinya. Dia menaikkan standar Flaming Rose dan berdiri di samping Thane, menunjukkan ikatan yang kuat antara keluarga bangsawan kuno dengan sang raja baru ke muka umum. Walaupun ayah dan saudara Astrid gugur di peperangan, dia mengabaikan kabar burung yang keluar dari Kuil. Dukungannya terhadap penahbisan Thane mampu mewujudkan stabilitas yang begitu dibutuhkan di masa-masa genting",
            "Arduin pernah menjadi pemimpin umat manusia yang dilatih Vedä. Pemberani dan gigih, Arduin menjadi sosok ideal pemimpin yang ideal. Pidatonya begitu menyentuh dan bersemangat, hingga menarik prajurit pemberontak yang muda dan bersemangat untuk bergabung dalam pasukannya, bertarung demi tujuan yang lebih mulia. Dilatih oleh Vedä, Arduin pernah menganggap Thane sebagai saingan. He memutuskan untuk menghadapi Thane demi kehormatan, namun akhirnya berhasil merebut rasa kagum Thane atas gaya tarungnya yang berani dan taktik yang meyakinkan. Setelah melalui kerja sama selama bertahun-tahun, Arduin akhirnya mengakui Thane sebagai sekutu dan pertemanan mereka pun semakin tumbuh",
            "Di planet Krypton yang hampir punah, sesosok anak yatim bernama Kal-El diletakkan di dalam roket dan dikirimkan ke planet Bumi yang jauh di sana. Kal-El, penghuni terakhir Krypton yang selamat, dibesarkan oleh sepasang petani, Martha dan Jonathan Kent, yang menamai anak lelaki mereka, Clark, dan menanamkan moral luhur yang menjadi awal lahirnya sesosok pahlawan bernama Superman. Seraya beranjak dari anak kecil menjadi remaja, dan kemudian menjadi dewasa, radiasi sinar matahari memungkinkan dirinya untuk melatih kemampuan luar biasa, termasuk kekuatan, kecepatan, dan kekebalan luar biasa. Dia juga memiliki kemampuan untuk terbang, lalu sinar X, laser, penglihatan mikroskopis, dan jarak jauh",
            "Panglima perang tertinggi, Arthut menemukan keabadian yang diimpikannya pada sihir Undead. Dia menggunakan logam ajaib untuk membuat cincin sihir Undead yang membentang lebih dari 50 km. Lalu mengairinya dengan darah 10 ribu jiwa untuk membuat negeri terkutuk yang penuh dengan kesedihan. Kekuatan Undead menyebar ke seluruh daratan seperti kebakaran hutan dan memusnahkan seluruh kehidupan. Bahkan Arthut sendiri tetap terkena efeknya. Tetapi karena perlindungan cincin, jiwanya terikat kuat kepada rangka tanpa daging dan darah. Sebagai pemilik cincin Undead, jiwa Arthur menjadi abadi dan dia bebas mengusir semua yang menentangnya. Siapapun yang berani menantang kekuasaannya akan tercabik-cabik",
            "Asal muasal Taara ada jauh di dalam Steel Mountains, tempat dia mendapatkan semua pengetahuan dan gairah akan persenjataan. Dia begitu bangga akan pemahaman yang dia miliki. Diantara semua senjata ciptaannya, Strong Hammer penghancur tanah menjadi yang terbaik. Dipilih terutama karena menjadi pilihan ideal bagi sang penempa senjata, senjata itu menjelma menjadi bagian dirinya yang mematikan di medan peperangan dan menjadi pemersatu pasukan"
    };

    private static int[] imgHeroWarrior = {
            R.drawable.florentino,
            R.drawable.yena,
            R.drawable.omen,
            R.drawable.zuka,
            R.drawable.richter,
            R.drawable.veres,
            R.drawable.ryoma,
            R.drawable.kilgroth,
            R.drawable.maloch,
            R.drawable.wonderwoman,
            R.drawable.wiro,
            R.drawable.roxie,
            R.drawable.max,
            R.drawable.lubu,
            R.drawable.amily,
            R.drawable.astrid,
            R.drawable.arduin,
            R.drawable.superman,
            R.drawable.arthur,
            R.drawable.taara
    };

    static ArrayList<Warrior> getListData(){
        ArrayList<Warrior> warriorlist = new ArrayList<>();
        for (int position = 0; position < heroWarrior.length; position++){
            Warrior warrior = new Warrior();
            warrior.setHeroWarrior(heroWarrior[position]);
            warrior.setRoleWarrior(roleHeroWarrior[position]);
            warrior.setStoryHeroWarrior(storyHeroWarrior[position]);
            warrior.setGambarHeroWarrior(imgHeroWarrior[position]);
            warriorlist.add(warrior);
        }
        return warriorlist;
    }
}
