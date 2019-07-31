package com.algovin373.project.moviecatalog.util

import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.model.TVShow

const val DATA_MOVIE_CATALOG = "MOVIE_CATALOG"

fun dataVideo(): ArrayList<Movie> {
    val arrayDataVideo = ArrayList<Movie>()

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

    return arrayDataVideo
}

fun dataTVShow(): ArrayList<TVShow> {
    val arrayDataTVShow = ArrayList<TVShow>()

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

    return arrayDataTVShow
}