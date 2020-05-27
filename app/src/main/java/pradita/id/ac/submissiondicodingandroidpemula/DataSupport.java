package pradita.id.ac.submissiondicodingandroidpemula;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.model.Support;

public class DataSupport {

    private static String[] nama_support = {
            "Tee Mee",
            "Annette",
            "Zip",
            "Payna",
            "Krizixx",
            "Alice"
    };

    private static String[] role_support = {
            "Support",
            "Support",
            "Support",
            "Support",
            "Support",
            "Support"
    };


    private static String[] story_support = {
            "Tee dan mee menjalani kehidupan yang bebas sebelum mereka jadi kesatria. Sayangnya kakak beradik itu harus terjun ke medan perang dengan imbalan makanan dan kebutuhan sehari hari. Karena di tanah Afata mulai sulit untuk menemukan makanan",
            "Annette memilih untuk tinggal di kota seasoul, penyihir pemula ini menjadi pilihan bagus untuk menghadapi masalah cuaca. Dia mampu mengidentifikasi tanda sekecil apapun di tengah barisan bintang yang rumit untuk menyimpulkan prediksi kemunculan taifun, dan mampu dengan mudah memperingatkan nelayan untuk bersiap menghadapi musibah ang akan menghampiri",
            "Zip merupakan salah satu spesies generasi baru yang berasal dari Abyss, dia tak memiliki cakar tajam atau raga yang kekar, hanyalah sesosok makhluk kecil berbulu yang tak mencolok atau garang layaknya monster Abyss. Namun zip bukanlah monster biasa, rasnya terlahir berkat ribuan tahun transformasi Abyss oleh bangsa iblis",
            "Pertama kali Payna melihat sayap Lauriel, ia sedang dikejar oleh Aleister. Aleister mengkhianati Bright Temple dan menginginkan Fountain of Light yang berada dibawah kekuasaan Lauriel. Lauriel hampir kalah menghadapi serangan The Fallen dan menderita luka parah sehingga melarikan diri ke Dark Forest. Disini dia bertemu dengan Payna, Sang Penjaga Hutan, yang memberikan bantuan",
            "Jika ada satu kata yang dapat menggambarkan Krizzix, yaitu pemalas. Meski berbakat dia enggan mengemban peran yang ditakdirkan untuknya. Untunglah, krizzix tidak hanya pemalas dan tidak jahat, dia selalu membantu mereka yang membutuhkannya. Walaupun dia selalu mengeluh saat melakukannya",
            "Alice adalah gadis termuda yang pernah mengabdi di dalam kuil. Itulah mengapa dia diijinkan untuk menolak tugas yang diberikan dan melewatkan hari – harinya untuk bermain dengan semua jenis makhluk menggemaskan. Walaupun nampak kekanakan dan lugu, kata takut tak ada di dalam kamusnya. Kemampuan sihirnya meningkatkan kekuatan pasukan secara drastis. Berkat kontribusi luar biasa yang ditunjukkan dirinya, Alice menerima gelar “Princess”"
    };

    private static int[] gambarHeroSupport = {
            R.drawable.teeme,
            R.drawable.annette,
            R.drawable.zip,
            R.drawable.payna,
            R.drawable.krizixx,
            R.drawable.alice
    };

    static ArrayList<Support> getListData() {
        ArrayList<Support> listSupport = new ArrayList<>();
        for (int position = 0; position < nama_support.length; position++){
            Support support = new Support();
            support.setNamaHeroSup(nama_support[position]);
            support.setRoleHeroSup(role_support[position]);
            support.setStoryHeroSup(story_support[position]);
            support.setSupportImage(gambarHeroSupport[position]);
            listSupport.add(support);
        }
        return listSupport;
    }
}
