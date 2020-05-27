package pradita.id.ac.submissiondicodingandroidpemula;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.model.Tank;

public class DataTank {

    private static String[] heroTank = {
            "Arum",
            "Baldum",
            "Chaugnar",
            "Chrest",
            "Lumburr",
            "Mina",
            "Omega",
            "Ormarr",
            "Skud",
            "Thane",
            "Toro",
            "Xeniel",
            "Y'bneth"
    };

    private static String[] roleHeroTank = {
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank",
            "Tank"
    };

    private static String[] storyHeroTank = {
            "Sepuluh tahun lalu Arum tiba di Tamuq bersama ayahnya, Varian yang memiliki pekerjaan sebagai prajurit. Tak butuh waktu lama baginya untuk menerima kenaikan pangkat, dan akhirnya dia pun berpangkat Jendral berdasarkan keputusan dewan Federal. Arum pada dasarnya merupakan individu bijaksana dan pengertian dan dia menyadari berapa besar tekanan yang dirasakan ayahnya",
            "Semua Centaur terlahir sebagai kesatria, dan Baldum merupakan yang paling impresif. Dia merupakan sosok legendaris dari era penuh kekacauan, tak hanya menjadi saksi atas awal dan akhir peperangan antara Manusia dan Afata dan dua Invasi Kegelapan, namun juga tak pernah henti melindungi semua makhluk hidup Moonlight Plains bersama Cosmic Totem miliknya",
            "Chaugnar adalah Mammoth purbakala yang dinodai energi kekacauan, yang mengubahnya menjadi sosok menyeramkan yang sekarang dia miliki. Kekacauan tak hanya mengubah penampilan Chaugnar, namun juga mengacaukan pikirannya. Di matanya, kehidupan hanyalah pertarungan tiada henti antara kekacauan dan ketertiban. Nyawa, peraturan, logika, perasaan, dan keyakinan tak berarti apa-apa baginya",
            "Catatan kuno tidak menceritakan asal muasal Cresht dengan detail. Satu-satunya pengetahuan tentangnya datang dari senandung para penyair. Pada Peperangan Manusia dan Monster, Cresht bertempur tanpa rasa takut di baris terdepan, menyiksa manusia tanpa henti. Mengherankannya, Cresht tidak kembali ke Lautan Mendidih setelah peperangan. Sebagai gantinya, dia mengejar tujuan yang lebih tinggi daripada sekedar memakan yang lemah",
            "Sebagai perwujudan dari keinginan Mother Earths, Lumburr diberikan kemampuan untuk merasakan dan menyelesaikan ketidakcocokan. Secara diam-diam dia telah melindungi bumi dan seluruh makhluknya selama berabad-abad. Lumburr berperilaku sesuai dengan hukum alam, yang kuat lah yang akan bertahan! Dengan hukum tersebut sebagai kode moral, Lumburr tidak pernah mencampuri perang antara Manusia dan Monster. Akan tetapi, Lumburr tidak bisa tinggal diam saat dia melihat kekuatan tidak alami dari Neraka yang menghancurkan segala yang dilewati. Melihat kebrutalan makhluk tersebut, Lumburr tidak ragu untuk mengambil alih beban perang pada pundaknya. Tanpa ragu ia segera keluar dari hutan dan bergabung di pertempuran",
            "Mina membuka mulutnya untuk menjawab, tetapi dia tidak dapat mengeluarkan suara sedikit pun. Kelaparan setelah tidak makan selama 2 hari dan efek dari obat dan sihir hitam pelan-pelan menghabisi apa yang ada dipikirannya. Mganga, Voodoo Jester, melihat Mina dengan kepuasan. Dia dapat melihat bahwa Mina hampir mecapai titik akhir. Eksperimen yang dia lakukan melebihi ekspektasi dia",
            "Memiliki dua kemampuan luar biasa yaitu dapat menghancurkan semua senjata serta kemampuan regenerasi yang sangat cepat, tidak ada yang tahu apakah Omega diciptakan untuk memenangkan perang atau mencegah perang. Keberadaannya dan kemampuannya yang bermusuhan telah memukau para dewa dan manusia. Banyak teori yang mengatakan bahwa Omega merupakan bagian dari peradaban kuno, sebelum peradaban dan dunia saat ini diciptakan. Namun demikian, Omega adalah satu bukti hidup dan seolah menjadi alien dari yang lainnya",
            "Lahir di klan Bloody Axe, Ormarr memiliki kekuatan peledak dan kemampuan bertahan yang hebat. Ormarr telah berperang jutaan kali dengan pedang dan palu cakarnya yang besar, Kemampuan bertarung yang luar biasa dan kesukaan berperang membuat ia terkenal dengan nama The Berzerker, serta dikagumi oleh sesama prajurit dan masyarakat luas",
            "Skud adalah boneka voodoo ciptaan kebanggaan Mganga. Dipenuhi darah iblis, ia memiliki kekuatan destruktif luar biasa dan hasrat membuat kekacauan. Tinjunya yang luar biasa dapat menggoyahkan semangat siapapun yang mencoba menggulingkan kekuasaan kegelapan. Pertempuran untuk Castle of Alchemy merupakan puncak pencapaian Skud. Walaupun ia memiliki pasukan di bawah 100 orang, ia mampu memimpin mereka menembus pertahanan mekanis yang disiapkan oleh Moren, spesialis persenjataan. Lalu ia sendirian menghancurkan 10 boneka Alchemy dan berjuang hingga bagian dalam istana",
            "King Thane yang gagah berani merupakan sosok raja klasik yang menjadi cita-cita setiap anak. Namun, tidak banyak yang mengetahui masa kecilnya yang sulit. Thane tumbuh tanpa ayahnya dan dibesarkan oleh biarawan. Masyarakat baru mengetahui keberadaan penerus tahta kerajaan dalam sebuah turnamen. Thane dengan mudahnya menarik pedang dari batu dan mengakhiri turnamen tersebut. Pada pedang tersebut terukir kata-kata \"Siapa yang berhasil melepaskan pedang ini dari batu, maka ia berhak menjadi raja",
            "Sebagai penguasa Emerald dan Rumbling Mountains, Toro dianggap sebagai salah satu penguasa utama di dunia. Kedigdayaan dan kekuatannya begitu terasa saat mengungguli Wukong di the Blood Oath of The Beast tanpa bantuan benda sihir apapun. Tak disangkal bahwa sebelumnya hubungan Toro dan Wukong tidak seburuk sekarang, namun semuanya memburuk semenjak Wukong melakukan perjalanan ke barat. Seandainya Wukong tak melakukan itu, anak Toro tentunya tak akan kehilangan arah dan selirnya masih hidup",
            "Xeniel memiliki jiwa yang tangguh dan raga yang kuat. Sebagai pendeta yang taat, Xeniel sepenuhnya loyal terhadap Holy Hall. Walaupun memiliki jabatan yang penting, Xeniel tetap rendah hati dan patuh sepenuhnya terhadap peraturan. Dia dianugerahi Hammer of Penance, yang menjadi bentuk peringatan bagi semua kaum kafir dan memikul Oracle of Enlightenment, menyebarkan ajaranNya ke semua orang",
            "Y'bneth. Dia merupakan individu yang berkeingintahuan tinggi, selalu ingin mempelajari ilmu baru sebagai Manusia Pohon dari Hutan Elborne merupakan penjaga alam yang kukuh. Y'bneth berhasrat untuk mengenal mereka semua. Mulai dari peri yang berlalu begitu cepat, burung yang menjelajahi langit, hewan yang mencari makanan, maupun ikan yang berenang. Dia sudah pernah menjelajahi Hutan Elborne yang luas, dan dia tak berniat berhenti sampai di situ. Semakin banyak ilmu yang dia dapat dari teman-teman barunya, semakin dia menyadari bahwa banyak hal yang belum dia ketahui"
    };

    private static int[] pictHeroTank = {
            R.drawable.arum,
            R.drawable.baldum,
            R.drawable.chaugnar,
            R.drawable.chrest,
            R.drawable.lumburr,
            R.drawable.mina,
            R.drawable.omega,
            R.drawable.ormarr,
            R.drawable.skud,
            R.drawable.thane,
            R.drawable.toro,
            R.drawable.xeniel,
            R.drawable.ybneth
    };

    static ArrayList <Tank> getListData(){
        ArrayList<Tank> listTank = new ArrayList<>();
        for (int position = 0; position < heroTank.length; position++){
            Tank tank = new Tank();
            tank.setHeroTank(heroTank[position]);
            tank.setRoleTank(roleHeroTank[position]);
            tank.setStoryHeroTank(storyHeroTank[position]);
            tank.setPictHeroTank(pictHeroTank[position]);
            listTank.add(tank);
        }
        return listTank;
    }

}
