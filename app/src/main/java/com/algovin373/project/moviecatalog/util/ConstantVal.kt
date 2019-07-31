package com.algovin373.project.moviecatalog.util

import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.model.TVShow

const val DATA_MOVIE_CATALOG = "MOVIE_CATALOG"

fun dataVideo(): ArrayList<Movie> {
    val arrayDataVideo = ArrayList<Movie>()
    // 1
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_a_start_is_born,
            "A Star is Born", "October 3, 2018", 2018,
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about " +
                    "given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's " +
                    "career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle " +
                    "with his own internal demons.",
            "Bradley Cooper",
            "Will Fetters, Eric Roth"
        )
    )
    // 2
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_alita,
            "Alita: Battle Angel", "January 31, 2019", 2019,
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by " +
                    "Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of " +
                    "a young woman with an extraordinary past.",
            "Robert Rodriguez", "James Cameron, Laeta Kalogridis"
        )
    )
    // 3
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_aquaman,
            "Aquaman", "December 7, 2018", 2018,
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the " +
                    "power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then " +
                    "the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to " +
                    "the throne.",
            "James Wan", "Will Beall, David Leslie Johnson-McGoldrick"
        )
    )
    // 4
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_bohemian,
            "Bohemian Rhapsody", "October 24, 2018", 2018,
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "Bryan Singer, Peter Morgan", "Anthony McCarten"
        )
    )
    // 5
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_cold_persuit,
            "Cold Pursuit", "February 7, 2019", 2019,
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            "Hans Petter Moland", "Frank Baldwin"
        )
    )
    // 6
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_creed,
            "Creed II", "November 21, 2018", 2018,
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            "Steven Caple Jr.", "Sylvester Stallone, Juel Taylor"
        )
    )
    // 7
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_crimes,
            "Fantastic Beasts: The Crimes of Grindelwald", "November 14, 2018", 2018,
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            "David Yates", "J.K. Rowling"
        )
    )
    // 8
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_glass,
            "Glass", "January 16, 2019", 2019,
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "M. Night Shyamalan", "M. Night Shyamalan"
        )
    )
    // 9
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_how_to_train,
            "How to Train Your Dragon: The Hidden World", "January 3, 2019", 2019,
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            "Dean DeBlois", "Dean DeBlois"
        )
    )
    // 10
    arrayDataVideo.add(
        Movie(
            R.drawable.movie_poster_infinity_war,
            "Avengers: Infinity War", "April 25, 2018", 2018,
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "Joe Russo, Anthony Russo", "Stephen McFeely, Christopher Markus"
        )
    )

    return arrayDataVideo
}

fun dataTVShow(): ArrayList<TVShow> {
    val arrayDataTVShow = ArrayList<TVShow>()
    // 1
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_arrow,
            "Arrow", "October 10, 2012", 2012,
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. " +
                    "He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed " +
                    "with a bow.",
            "-", "-"
        )
    )
    // 2
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_doom_patrol,
            "Doom Patrol", "February 15, 2019", 2019,
            "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also " +
                    "left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, " +
                    "who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what " +
                    "they find.",
            "-", "-"
        )
    )
    // 3
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_dragon_ball,
            "Dragon Ball", "February 26, 1986", 1986,
            "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. " +
                    "Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his " +
                    "own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon " +
                    "balls brought her to Goku's home. Together, they set off to find all seven dragon balls in an adventure.",
            "-", "-"
        )
    )
    // 4
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_fairytail,
            "Fairy Tail", "October 12, 2009", 2009,
            "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
            "-", "-"
        )
    )
    // 5
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_family_guy,
            "Family Guy", "January 31, 1999", 1999,
            "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            "-", "-"
        )
    )
    // 6
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_flash,
            "The Flash", "October 7, 2014", 2014,
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            "-", "-"
        )
    )
    // 7
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_gotham,
            "Gotham", "September 22, 2014", 2014,
            "Before there was Batman, there was GOTHAM.\n" +
                    "\n" +
                    "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            "-", "-"
        )
    )
    // 8
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_grey_anatomy,
            "Grey's Anatomy", "March 27, 2005", 2005,
            "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
            "-", "-"
        )
    )
    // 9
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_naruto_shipudden,
            "Naruto Shippuden", "February 15, 2007", 2007,
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            "-", "-"
        )
    )
    // 10
    arrayDataTVShow.add(
        TVShow(
            R.drawable.tvshow_poster_the_walking_dead,
            "The Walking Dead", "October 31, 2010", 2010,
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "-", "-"
        )
    )


    return arrayDataTVShow
}