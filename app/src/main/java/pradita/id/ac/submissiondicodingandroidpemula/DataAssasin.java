package pradita.id.ac.submissiondicodingandroidpemula;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.model.Assasin;

public class DataAssasin {

    private static String[] nama_assasin = {
            "Murad",
            "Quillen",
            "Airi",
            "Enzo",
            "Kriknak",
            "Nakroth",
            "Wukong",
            "Zephys",
            "Zanis",
            "Zill"
    };

    private static String[] role_assasin = {
            "Assasin",
            "Assasin",
            "Assasin",
            "Assasin",
            "Assasin",
            "Assasin",
            "Assasin",
            "Assasin",
            "Assasin",
            "Assasin"
    };

    private static String[] kisah_assain = {
            "Saat Murad menginjak usia dewasa, ia mewarisi senjata super yang dapat memanipulasi ruang dan waktu, Murad memimpin prajuritnya memperluas kerajaan dan membasmi pemberontak. Hal ini tentu mengancam kekuasaan Azzen’ka yang semakin murka setelah mengetahui rahasia senjata tersebut. Tetapi Murad tidak takut, dengan senjata tersebut Azzen’ka tidak akan mampu mengalahkannya",
            "Quillen adalah bintang politik yang sedang naik daun di Free Federation. Muda, tampan, berkelas, rapih, terpelajar, fasih dan lhai dalam waktu bersamaan, Quillen akan berada di puncak kekuasaan jika dia tidak radikal dalam sikap politiknya. Quillen tidak pernah berencana untuk mengubah sudut pandangnya, dengan kata lain dia memiliki waktu dan kesabaran untuk menunggu para senator pensiun atau bahkan menemui ajalnya. Perasaan Quillen bercampur aduk terkait keputusanya dan menyesal akan fakta bahwa umat manusia tak berumur panjang",
            "Banyak klan ninja yang bermunculan, namun Steel Dragons yang misterius telah ada selama beberapa generasi. Sebagai ketua ninja generasi baru Airi tak hanya mewarisi gelar “Kunoichi” namun juga pengakuan Sang Naga Kuno berkat bakatnya yang luar biasa. Dia pun dipercaya untuk mengemban Dragon’s Mark. Seraya malam hari, satuan ninja elit yang dipimpin Airi bergegas menyelamatkan Temple of Light dari serbuan pasukan iblis yang mengepungnya. Menggunakan kemampuan klon bayangan Airi mengelak dari serangan ilmu hitam prajurit Fallen dan langsung menerjang ke arah Maloch, Sang komandan Pasukan Iblis. Tebasan pun  mendarat, darah mengucur dari dada Maloch dan sayapnya yang kokoh pun tergoyak. Serangan Airi benar – benar melumpuhkan sang komandan yang terkenal tangguh itu",
            "Berasal dari Gunung Ophean, Enzo telah didoktrin ajaran kuil semenjak kecil dan diterima pihak gereja berkat bakat seninya yang luar biasa serta keimanannya yang tinggi. Sebagai pengadil, Enzo tampil sebagai sosok yang terkenal di kuil, ada yang menganguminya namun ada juga yang iri. Pikiran jahat merasuki benak Enzo seraya dia mengikis semangat korbannya sedikit demi sedikit seraya meneteskan darah merah kental ke lantai batu yang dingin",
            "Sulit mengatakan apakah Kriknak tinggal di alam kehidupan atau kematian, karena makhluk ini berkeliaran dengan bebasnya di medan pemakaman, memperkuat dirinya dengan menghisap energidari raga yang membusuk. Walaupun dirinya sendiri memiliki raga dan jiwa, sudah tentu hal – hal seputar kehidupan atau kematian tak pernah menganggu pikiran Kriknak. Satu satunya yang menarik perhatiannya adalah perintah sang majikan Marja",
            "Nakroth bersama pasukan Blood Knight tiba di kamp sebelum badai menghantam. Para prajurit segera memberi jalan untuk pasukan pembawa kemenangan itum, reputasi pasukan Blood Knight sudah melegenda tak pernah kalah, tak kenal ampun, dan tak membiarkan lawan mereka kabur. Kapten Nakroth hanya bisa menanggapi dengan senyum getir. Karena dia dikenal akan kebaikan dan rasa ampunnya sebelum satuan Blood Knight dikenal atas reputasi menyeramkannya",
            "Setelah menyelesaikan perjalanan ke barat, Wukong memperoleh gelar “Victorious Fighting Buddha” atas semua pencapaiannya. Wukong bukanlah pribadi baik hati ataupun tertib. Kalau bukan karena kekangan Gautama Buddha, dia pasti sudah berkelahi setiap hari, bahkan setelah dirinya menjadi dewa sekalipun. Saat kabar bencana yang dihadapi Athanor tiba di Purva-videha, Wukong menawarkan diri untuk pergi ke Athanor, disana dia kembali menampakkan sosok sejatinya yang memberi peringatan pada semua Hero disana",
            "Beberapa hikayat mengisahkan cerita malaikat maut atau Valkyrie yang datang untuk menuntun roh orang mati ke alam baka. Namun Lord Zepys lah yang mengantar roh ke daerah kekuasaan Valkyrie di bawah angin barat yang dingin. Zephys secara pribadi memanen semua roh makhluk hidup untuk menghadapi penghakiman di neraka",
            "Sebelum dikenal sebagai DragonSlayer, Zanis hanyalah sesosok kapten kavaleri biasa yang melayani kebangsawanan Bach Kebangsawanan ini jadi cikal bakal terbentuknya pelindung Kingdom Of Norman di timur laut. Lokasi Bach yang terpencil disertai disertai karakteristik geografis yang jadi pelindung alami menjadikannya daerah yang damai. Oleh karenanya pemanfaatan daya tarung Zanis hanya terbatas pada perburuan bandit saja",
            "Di peperangan dahulu, Zill membantai lusinan iblis, yang membuat dirinya terkenal dan dipuja banyak pihak. Pencapaiannya yang luar biasa itu menganugerahi dirinya status dan posisi yang penting. Namun, tak ada yang memahami penolakan dirinya atas gelar Guardian of The Forest Shadow. Dia berkata bahwa kekangan kejayaan berlawanan dengan sifat dasarnya yang cinta kebebasan"
    };

    private static int[] gambarHeroAssasin = {
            R.drawable.murad,
            R.drawable.quillen,
            R.drawable.airi,
            R.drawable.enzo,
            R.drawable.kriknak,
            R.drawable.nakroth,
            R.drawable.wukong,
            R.drawable.zephys,
            R.drawable.zanis,
            R.drawable.zill
    };

    static ArrayList<Assasin> getListData() {
        ArrayList<Assasin> listAssasin = new ArrayList<>();
        for (int position = 0; position < nama_assasin.length; position++) {
            Assasin assasin = new Assasin();
            assasin.setAssain_name(nama_assasin[position]);
            assasin.setRole_assasin(role_assasin[position]);
            assasin.setStory_assasin(kisah_assain[position]);
            assasin.setAssasin_image(gambarHeroAssasin[position]);
            listAssasin.add(assasin);
        }
        return listAssasin;
    }
}
