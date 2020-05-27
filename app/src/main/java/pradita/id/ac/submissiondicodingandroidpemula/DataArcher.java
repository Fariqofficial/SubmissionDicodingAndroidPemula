package pradita.id.ac.submissiondicodingandroidpemula;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.model.Archer;

public class DataArcher {

    private static String[] NamaArcher = {
            "Yorn",
            "Valhein",
            "Violet",
            "Fennik",
            "Slimz",
            "Wisp",
            "Moren",
            "Lindis",
            "Tel'anas",
            "Hayate",
            "The Joker",
            "Elsu",
            "Capheny",
            "Brunhilda",
            "Rourke"
    };

    private static String[] roleArcher = {
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer",
            "Archer"
    };

    private static String[] storyArcher = {
            "Sebagai kepala the Holy Knights, Yorn memiliki tubuh yang kuat, wajah tampan, dan keterampilan memanah yang luar biasa. Dalam pertempuran, betapapun brtualnya atau mengerikannya itu. Yorn selalu mengambil peran memimpin the Holy Knights menuju kemenangan dan kemuliaan. Yorn dilahirkan di Holy Hall dan dibesarkan secara religius. Mimpi terbesar yorn adalah berdoa dengan saleh untuk Holy Hall dan Dewa – dewi sampai kematiannya, namun dia ditakdirkan untuk tanggung jawab dan tugas yang lebih penting",
            "Dibelahan timur padang Gobi, para pemburu dipimpin oleh Valhein sudah menempuh perjalanan selama berminggu – minggu di wilayah musuh. Pasukan sekutu, yang mengambil dua rute ke arah utara dan selatan telah mengirim pasukan utamanya ke barisan depan dengan misi darurat untuk menumbangkan dua pasukan musuh. “Kita sangat kalah jumlah dibandingkan musuh. Namun, kita sanggup bergerak diam – diam. Kita pasti akan unggul jika mengambil inisiatif menyerang bukan bertahan.” ujar Valhein, wakil komandan dari Demon Hunter menyampaikan siasatnya. Siasat yang diajukan Valhein didukung oleh semua rapat militer termasuk Violet bekas komandannya yang kini menjadi pengembara",
            "Di perbatasan Desert of Death, para Demon Hunter berjalan dengan lesu di tengah badai pasir yang menerpa wajah mereka. Violet yang begitu mendambakan dapat menyelimuti dirinya dalam lipatan kain tebal, mengutuk daratan berpasir yang tak beradab, kasar dan barbar. Jabatannya saat ini seharusnya dapat menghindarkan dirinya dari ekspedisi berat seperti ini. Violet menjadi pengembara yang mengumpulkan imbalan dari misi yang disebarkan Federasi. Terkadang dia harus pergi jauh dan berpergian ke negara lain sebagai tentara bayaran",
            "Fennik merupakan pengacau yang terkenal di Moonlit Plains, kenyataanya lebih ahli dalam bertarung dibanding kemampannya dalam menyusun siasat, namun dalam skala yang berbeda. Hal ini dikarenakan kemampuan menyusun siasat melebihi pencuri pada umumnya. Di usia yang muda, dia mamu melampaui pendahulunya bahkan pada akhirnya berada di puncak daftar",
            "Slimz beroperasi di daratan diantara Castle of Inception dan Forest of Shadow. Seperti pedagang lainnya, dia sangat percaya prinsip “keadilan”. Ketika kesepakatan telah tercapai, Slimz mendemontrasikan “keadilan” ini dengan membuat rekan bisnisnya “kering”. Setelah perang meletus, Slimz melihat peluang bisnis dan mengajak spesialis senjata Moren untuk membangun Castle of Alchemy di perbatasan. Lagipula Slimz adalah pedagang dan dia netral di peperangan",
            "Wisp tak hanya merupakan puteri angkat dari Moren yang termahsyur, namun juga adik dari Max “The Wonderkid”. Hanya kurang dari 2 tahun, Wisp berhasil menguasai segala hal tentang permesinan dan fungsinya. Pada akhirnya, dia merasa bahwa merakt bom sudah keahlian utamanya, yang berarti dia harus berpindah tempat tinggal ke area pegunungan yang berpopulasi sedikit agar bisa terus bereksperimen",
            "Jika bukan karena sifat yang kasar dan keras kepala, mungkin Moren dapat menjadi ilmuwan, menyendiri di suatu menara sambil belajar. Namun sebagai kurcaci, moren terbiasa untuk minum dan bertarung, lebih mengandalkan tinju dan senjata dibandingkan berdiskusi. Hasilnya, tak ada orang yang mau menjadi gurunya. Hal ini memaksa Moren untuk menggunakan keterampilan tangannya untuk bidang lain, yaitu ilmu pengetahuan dan pandai besi. Mitos mengatakan bahwa hampir setengah dari senjata terhebat seluruh dunia adalah buatan Moren, sehingga Moren sangat dihargai oleh para dewa maupun monster",
            "Lindis dan Luna merupakan dua kandidat yang paling hebat. Kemampuan mereka meningkat pesat selama latihan dan hampir mampu menguasai seluruh kekuatan bulan. Namun Lindis tahu bahwa kakanya Luna lebih unggul. Luna sangat cerdas, cantik, dan berbakat. Lindis sangat menganggumi Luna sama seperti teman – teman lain. Kedua kakak beradik ini memiliki hubungan batin yang sangat kuat",
            "Sebagai salah satu kesatria pemberani penentang serangan awal pasukan kegelapan, Tel’anas yang melegenda berkat keahlian berpanahnya yang tak tertandingi, menjadi ilham serangkaian lagu dan puisi sepanjang ratusan tahun lamanya. Tel’anas lah yang menembaskan satu - satunya panah yang menimbulkan luka parah di raga Sang Raja Kegelapan, yang memastikan keberlangsungan hidup semua makhluk hidup yang kehilangan perlindungan para dewa di periode sejarah yang kelam ini",
            "Hayate merupakan ninja dari Pulau Kabut. Semenjak dewasa, dia mengikuti ketua klannya, melindungi gerbang laut menuju Gunung Orphean. Hanya sedikit yang mengetahui keberadaan mereka, yang tentunya mempermudah usaha mereka untuk melindungi dunia dari kegelapan",
            "Awal mula The Joker diselimuti misteri, namun yang diketahui dari dirinya adalah bahwa dulu dia hanyalah penjahat kelas teri yang akibat salah satu kecelakaan mengubah dirinya menjadi the Clowen Prince of Crime. Keyakinan The Joker bahwa kehidupan itu rentan akan perubahan menjadi pendorong bagi dirinya untuk berbuat kekacauan yang menjadi akar rezim terornya di kota Gotham",
            "Sebagai seseorang yang berasal dari Mildar, Elsu memiliki ikatan yang kuat dengan kota itu. Orang tuanya meninggal akibat wabah tak lama setelah dia lahir. Dia bertekad untuk menjadi “Pelindung Kota” demi membalas jasa yang diberikan kota Mildar kepadanya. Berbekal kemampuan akademis serta berpanah yang  luar biasa, Elsu ditahbiskan sebagai Pelindung Kota. Walaupun dia terliat serius setiap saat, dia dicintai dan dihormati rekannya. Semasa perang, tembakannya selalu tepat sasaran. Hanya dalam 3 tahun, tim khusus Elsu tak hanya menyelesaikan semua misi militer dengan hasil mencengangkan, namun juga dipuji oleh Dewan Federasi di berbagai kesempatan",
            "Enam bulan lalu, Capheny kembali dari studinya di Mildar, bergabung dengan Videl Institute, tempat kedua orang tuanya bekerja. Videl Military Institute merupakan perusahaan terbesar yang bergerak di bidang industri milter di Confederation. Kegiatan produksi dan penjualan senjata secara ketat diatur oleh hukum yang bertujuan agar dapat dipergunakan di perang secara sah dan semestinya. Saat dia mengetahui kenyataan yang sesungguhnya, Capheny disekap oleh orang tuanya sendiri. Capheny tak tahu apakah mereka membiarkannya hidup karena masih menganggap dirinya sebagai anak, atau apakah demi memanfaatkan ilmu yang dimilikinya",
            "Brunhilda adalah ketua baru Night Owl, sebuah perkumpulan yang pernah memiliki reputasi baik dipinggiran Federation, yang berkecimpung dalam kegiatan abu – abu (antara legal dan ilegal). Namun, seraya berkembangnya perdagangan di pusat, persaingan dan ambisi yang semakin menjadi pun memaksa perkumpulan kecil itu berurusan dengan kegiatan berbahaya",
            "Banyak yang lupa bahwa Rourke, Sang Kapten yang senantiasa tersenyum dan ceria dulunya sesosok kesatria pemberani, hingga mereka melihat bekas luka ditangannya. Dia berasal dari Casanova Fort, ikut serta dalam ratusan peperangan, termasuk pertempuran di Baskhir. Andai ada orang yang menumpuk catatan perang yang berisi namanya, maka sesungguhnya tingginya akan jauh melebih Rourke"
    };

    private static int[] gambarHero = {
            R.drawable.yorn,
            R.drawable.valhein,
            R.drawable.violet,
            R.drawable.fennik,
            R.drawable.slimz,
            R.drawable.wisp,
            R.drawable.moren,
            R.drawable.lindis,
            R.drawable.telanas,
            R.drawable.hayate,
            R.drawable.joker,
            R.drawable.elsu,
            R.drawable.capheny,
            R.drawable.brunhilda,
            R.drawable.rourke
    };

    static ArrayList<Archer>getListData(){
        ArrayList<Archer> list = new ArrayList<>();
        for (int position = 0; position < NamaArcher.length; position++){
            Archer archer = new Archer();
            archer.setNama_archer(NamaArcher[position]);
            archer.setRole_hero(roleArcher[position]);
            archer.setStory_archer(storyArcher[position]);
            archer.setImage_hero(gambarHero[position]);
            list.add(archer);
        }
        return list;
    }
}
