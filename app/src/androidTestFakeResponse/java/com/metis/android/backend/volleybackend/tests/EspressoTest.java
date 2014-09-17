package com.metis.android.backend.volleybackend.tests;

import android.test.ActivityInstrumentationTestCase2;

import com.google.android.apps.common.testing.ui.espresso.Espresso;
import com.google.android.apps.common.testing.ui.espresso.action.ViewActions;
import com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions;
import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;
import com.google.mockwebserver.MockResponse;
import com.google.mockwebserver.MockWebServer;
import com.metis.android.template.R;
import com.metis.android.template.controller.activity.MainActivity;

public class EspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private static final String RESPONSE_STRING = "{\"total\":81,\"movies\":[{\"id\":\"771225175\"," +
            "\"title\":\"Godzilla\",\"year\":2014,\"mpaa_rating\":\"PG-13\",\"runtime\":138," +
            "\"critics_consensus\":\"\",\"release_dates\":{\"theater\":\"2014-05-16\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_rating\":\"Certified Fresh\",\"critics_score\":73,\"audience_rating\":\"Upright\",\"audience_score\":69},\"synopsis\":\"In Summer 2014, the world's most revered monster is reborn as Warner Bros. Pictures and Legendary Pictures unleash the epic action adventure \\\"Godzilla.\\\" From visionary new director Gareth Edwards (\\\"Monsters\\\") comes a powerful story of human courage and reconciliation in the face of titanic forces of nature, when the awe-inspiring Godzilla rises to restore balance as humanity stands defenseless. (c) Warner Bros\",\"posters\":{\"thumbnail\":\"http://content8.flixster.com/movie/11/17/95/11179578_tmb.jpg\",\"profile\":\"http://content8.flixster.com/movie/11/17/95/11179578_tmb.jpg\",\"detailed\":\"http://content8.flixster.com/movie/11/17/95/11179578_tmb.jpg\",\"original\":\"http://content8.flixster.com/movie/11/17/95/11179578_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Aaron Taylor-Johnson\",\"id\":\"326397411\",\"characters\":[\"Ford Brody\"]},{\"name\":\"Elizabeth Olsen\",\"id\":\"770827678\",\"characters\":[\"Elle Brody\"]},{\"name\":\"Bryan Cranston\",\"id\":\"326392501\",\"characters\":[\"Joe Brody\"]},{\"name\":\"David Strathairn\",\"id\":\"162654527\",\"characters\":[\"Admiral William Stenz\"]},{\"name\":\"Ken Watanabe\",\"id\":\"335718197\",\"characters\":[\"Dr. Ishiro Seriwaza\"]}],\"alternate_ids\":{\"imdb\":\"0831387\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771225175.json\",\"alternate\":\"http://www.rottentomatoes.com/m/godzilla_2014/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771225175/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771225175/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771225175/similar.json\"}},{\"id\":\"771365948\",\"title\":\"The Fault In Our Stars\",\"year\":2014,\"mpaa_rating\":\"PG-13\",\"runtime\":125,\"critics_consensus\":\"\",\"release_dates\":{\"theater\":\"2014-06-06\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_rating\":\"Certified Fresh\",\"critics_score\":80,\"audience_rating\":\"Upright\",\"audience_score\":88},\"synopsis\":\"Hazel and Gus are two extraordinary teenagers who share an acerbic wit, a disdain for the conventional, and a love that sweeps them - and us - on an unforgettable journey. Their relationship is all the more miraculous, given that they met and fell in love at a cancer support group. THE FAULT IN OUR STARS, based upon the number-one bestselling novel by John Green, explores the funny, thrilling and tragic business of being alive and in love.(C) Fox\",\"posters\":{\"thumbnail\":\"http://content8.flixster.com/movie/11/18/03/11180370_tmb.jpg\",\"profile\":\"http://content8.flixster.com/movie/11/18/03/11180370_tmb.jpg\",\"detailed\":\"http://content8.flixster.com/movie/11/18/03/11180370_tmb.jpg\",\"original\":\"http://content8.flixster.com/movie/11/18/03/11180370_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Shailene Woodley\",\"id\":\"770676364\",\"characters\":[\"Hazel\"]},{\"name\":\"Ansel Elgort\",\"id\":\"771409061\",\"characters\":[\"Gus\"]},{\"name\":\"Willem Dafoe\",\"id\":\"162668400\",\"characters\":[\"Van Houten\"]},{\"name\":\"Nat Wolff\",\"id\":\"459518388\",\"characters\":[\"Isaac\"]},{\"name\":\"Laura Dern\",\"id\":\"162654251\",\"characters\":[\"Frannie\"]}],\"alternate_ids\":{\"imdb\":\"2582846\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771365948.json\",\"alternate\":\"http://www.rottentomatoes.com/m/the_fault_in_our_stars/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771365948/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771365948/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771365948/similar.json\"}},{\"id\":\"771358910\",\"title\":\"Think Like a Man Too\",\"year\":2014,\"mpaa_rating\":\"PG-13\",\"runtime\":106,\"critics_consensus\":\"\",\"release_dates\":{\"theater\":\"2014-06-20\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_rating\":\"Rotten\",\"critics_score\":24,\"audience_rating\":\"Upright\",\"audience_score\":65},\"synopsis\":\"In the highly anticipated sequel, which was inspired by Steve Harvey's best-selling book Act Like a Lady, Think Like A Man, all the couples are back for a wedding in Las Vegas. But plans for a romantic weekend go awry when their various misadventures get them into some compromising situations that threaten to derail the big event. (c) Sony\",\"posters\":{\"thumbnail\":\"http://content6.flixster.com/movie/11/18/05/11180504_tmb.jpg\",\"profile\":\"http://content6.flixster.com/movie/11/18/05/11180504_tmb.jpg\",\"detailed\":\"http://content6.flixster.com/movie/11/18/05/11180504_tmb.jpg\",\"original\":\"http://content6.flixster.com/movie/11/18/05/11180504_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Adam Brody\",\"id\":\"162652628\",\"characters\":[\"Isaac\"]},{\"name\":\"Michael Ealy\",\"id\":\"162713769\",\"characters\":[\"Dominic\"]},{\"name\":\"Jerry Ferrara\",\"id\":\"364659706\",\"characters\":[\"Jeremy\"]},{\"name\":\"Meagan Good\",\"id\":\"162654101\",\"characters\":[\"Mya\"]},{\"name\":\"Regina Hall\",\"id\":\"162667054\",\"characters\":[\"Candace\"]}],\"alternate_ids\":{\"imdb\":\"2239832\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771358910.json\",\"alternate\":\"http://www.rottentomatoes.com/m/think_like_a_man_too/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771358910/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771358910/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771358910/similar.json\"}},{\"id\":\"771355959\",\"title\":\"The German Doctor\",\"year\":2014,\"mpaa_rating\":\"PG-13\",\"runtime\":93,\"critics_consensus\":\"\",\"release_dates\":{\"theater\":\"2014-04-25\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_rating\":\"Fresh\",\"critics_score\":73,\"audience_rating\":\"Upright\",\"audience_score\":61},\"synopsis\":\"Patagonia, 1960. A German doctor (Alex Brendemuhl) meets an Argentinean family and follows them on a long desert road to a small town where the family will be starting a new life. Eva (Natalia Oreiro), Enzo (Diego Peretti) and their three children welcome the doctor into their home and entrust their young daughter, Lilith (Florencia Bado), to his care, not knowing that they are harboring one of the most dangerous criminals in the world. At the same time, Israeli agents are desperately looking to bring THE GERMAN DOCTOR to justice. Based on filmmaker Lucia Puenzo's (XXY) fifth novel, the story follows Josef Mengele, the \\\"Angel of Death,\\\" a German SS officer and a physician at the Auschwitz concentration camp, in the years he spent \\\"hiding\\\", along with many other Nazi's, in South America following his escape from Germany. Mengele was considered to be one of WWII's most heinous Nazi war criminals. (c) Samuel Goldwyn\",\"posters\":{\"thumbnail\":\"http://content9.flixster.com/movie/11/17/60/11176071_tmb.jpg\",\"profile\":\"http://content9.flixster.com/movie/11/17/60/11176071_tmb.jpg\",\"detailed\":\"http://content9.flixster.com/movie/11/17/60/11176071_tmb.jpg\",\"original\":\"http://content9.flixster.com/movie/11/17/60/11176071_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Alex Brendemuhl\",\"id\":\"385330906\",\"characters\":[\"Mengele\"]},{\"name\":\"Florencia Bado\",\"id\":\"771447491\",\"characters\":[\"Lilith\"]},{\"name\":\"Diego Peretti\",\"id\":\"364647481\",\"characters\":[\"Enzo\"]},{\"name\":\"Natalia Oreiro\",\"id\":\"247606590\",\"characters\":[\"Eva\"]},{\"name\":\"Alan Daicz\",\"id\":\"771444832\",\"characters\":[\"Tomas\"]}],\"alternate_ids\":{\"imdb\":\"1847746\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771355959.json\",\"alternate\":\"http://www.rottentomatoes.com/m/the_german_doctor/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771355959/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771355959/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771355959/similar.json\"}},{\"id\":\"771355918\",\"title\":\"Ilo Ilo\",\"year\":2014,\"mpaa_rating\":\"Unrated\",\"runtime\":99,\"critics_consensus\":\"\",\"release_dates\":{\"theater\":\"2014-04-04\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_rating\":\"Fresh\",\"critics_score\":100,\"audience_rating\":\"Upright\",\"audience_score\":83},\"synopsis\":\"Set in Singapore during the 1997 Asian financial crisis. Ilo Ilo chronicles the day-to-day drama of the Lim family - troublesome grade-schooler Jiale and his overstressed parents, Heck and Leng. Comfortably middleclass and with another baby on the way, they hire Teresa, a Filipino immigrant, as a live-in maid and nanny. An outsider in both the family and Singapore itself, Teresa initially struggles to manage Jiale's antics and find her footing in her new community. The two eventually form a unique bond, but just as Teresa becomes an unspoken part of the family, unforeseen circumstances in an uncertain economy will challenge the new normal yet again. (c) Film Movement\",\"posters\":{\"thumbnail\":\"http://content7.flixster.com/movie/11/17/73/11177309_tmb.jpg\",\"profile\":\"http://content7.flixster.com/movie/11/17/73/11177309_tmb.jpg\",\"detailed\":\"http://content7.flixster.com/movie/11/17/73/11177309_tmb.jpg\",\"original\":\"http://content7.flixster.com/movie/11/17/73/11177309_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Koh Jia Ler\",\"id\":\"771446239\",\"characters\":[\"Jiale\"]},{\"name\":\"Angeli Bayani\",\"id\":\"770815231\",\"characters\":[\"Teresa\"]},{\"name\":\"Yann Yann Yeo\",\"id\":\"319158037\",\"characters\":[\"Mother\"]},{\"name\":\"Tian Wen Chen\",\"id\":\"771446240\",\"characters\":[\"Father\"]},{\"name\":\"Peter Wee\",\"id\":\"771453351\",\"characters\":[\"Discipline Master\"]}],\"alternate_ids\":{\"imdb\":\"2901736\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771355918.json\",\"alternate\":\"http://www.rottentomatoes.com/m/ilo_ilo/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771355918/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771355918/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771355918/similar.json\"}},{\"id\":\"771315379\",\"title\":\"Casting By\",\"year\":2013,\"mpaa_rating\":\"PG\",\"runtime\":89,\"release_dates\":{\"theater\":\"2013-11-01\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_rating\":\"Fresh\",\"critics_score\":93,\"audience_rating\":\"Upright\",\"audience_score\":80},\"synopsis\":\"\\\"Outstanding\\\" - Leonard Maltin; Combining over 240 interviews, extensive archival footage, animated stills & documents with a moving original score, Director Tom Donahue has meticulously crafted the untold tale of the Hollywood casting director. CASTING BY is a celebration of the profession, highlighting its previously unsung role in film history while also serving as an elegy to the lost era of the New Hollywood. The documentary focuses on pioneer Marion Dougherty, an iconoclast whose exquisite taste, tenacity and gut instincts brought a new kind of actor to the screen that would mark the end of the old studio system and help to usher in this revolutionary new period. The film skillfully draws a line through the last half century to show us the profession's evolution from studio system type-casting to the rise of large ensemble films populated with unique and diverse casts. The interviewees are a Who's Who of Hollywood legends including Martin Scorsese, Woody Allen, Clint Eastwood, Glenn Close, Robert Duvall, Jeff Bridges, Al Pacino, Robert De Niro, Diane Lane, Jon Voight, Danny Glover, Bette Midler, John Travolta and countless others. (c) Official Facebook\",\"posters\":{\"thumbnail\":\"http://content9.flixster.com/movie/11/17/46/11174671_tmb.jpg\",\"profile\":\"http://content9.flixster.com/movie/11/17/46/11174671_tmb.jpg\",\"detailed\":\"http://content9.flixster.com/movie/11/17/46/11174671_tmb.jpg\",\"original\":\"http://content9.flixster.com/movie/11/17/46/11174671_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Marion Dougherty\",\"id\":\"770927490\"},{\"name\":\"Al Pacino\",\"id\":\"162654461\"},{\"name\":\"Glenn Close\",\"id\":\"162653084\"},{\"name\":\"Robert Redford\",\"id\":\"162653875\"},{\"name\":\"John Sayles\",\"id\":\"162660790\"}],\"alternate_ids\":{\"imdb\":\"1293751\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771315379.json\",\"alternate\":\"http://www.rottentomatoes.com/m/casting_by/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771315379/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771315379/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771315379/similar.json\"}},{\"id\":\"771356350\",\"title\":\"The Battery\",\"year\":2014,\"mpaa_rating\":\"Unrated\",\"runtime\":101,\"release_dates\":{\"theater\":\"2014-06-10\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_score\":-1,\"audience_rating\":\"Upright\",\"audience_score\":66},\"synopsis\":\"Zombies. Baseball. Road Trip. What more do you need? A FilmBuff Presentation.\",\"posters\":{\"thumbnail\":\"http://content6.flixster.com/movie/11/17/23/11172304_tmb.jpg\",\"profile\":\"http://content6.flixster.com/movie/11/17/23/11172304_tmb.jpg\",\"detailed\":\"http://content6.flixster.com/movie/11/17/23/11172304_tmb.jpg\",\"original\":\"http://content6.flixster.com/movie/11/17/23/11172304_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Jeremy Gardner\",\"id\":\"771443700\"},{\"name\":\"Adam Cronheim\",\"id\":\"771447083\"},{\"name\":\"Niels Bolle\",\"id\":\"771447084\"}],\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771356350.json\",\"alternate\":\"http://www.rottentomatoes.com/m/the_battery/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771356350/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771356350/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771356350/similar.json\"}},{\"id\":\"771362195\",\"title\":\"Burt's Buzz\",\"year\":2014,\"mpaa_rating\":\"Unrated\",\"runtime\":88,\"release_dates\":{\"theater\":\"2014-06-06\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_rating\":\"Fresh\",\"critics_score\":70,\"audience_rating\":\"Spilled\",\"audience_score\":50},\"synopsis\":\"BURT'S BUZZ takes an intimate look at the world of Burt Shavitz, the face and co-founder of Burt's Bees, exploring his fascinating and unique life. Wise and wry, ornery and opinionated, the reclusive Shavitz is committed to living off the land and keeping true to his humble beginnings despite his celebrity status. The film chronicles Burt's life as a photographer, beekeeper, and brand spokesman, following his complicated relationship with the company, his fans, and the world around him. Exposing the collision between business and personal values, \\\"Burt's Buzz\\\" is a compelling and fascinating portrait of this highly idiosyncratic pioneer, and a revealing study of what it means to be a living icon. (C) FilmBuff\",\"posters\":{\"thumbnail\":\"http://content7.flixster.com/movie/11/17/78/11177889_tmb.jpg\",\"profile\":\"http://content7.flixster.com/movie/11/17/78/11177889_tmb.jpg\",\"detailed\":\"http://content7.flixster.com/movie/11/17/78/11177889_tmb.jpg\",\"original\":\"http://content7.flixster.com/movie/11/17/78/11177889_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Burt Shavitz\",\"id\":\"771463912\"},{\"name\":\"Priscilla Potter\",\"id\":\"771493531\"},{\"name\":\"Bruce Tibbetts\",\"id\":\"771493532\"},{\"name\":\"A.C. Kulik\",\"id\":\"771493533\"},{\"name\":\"Nick Vlahos\",\"id\":\"771283150\"}],\"alternate_ids\":{\"imdb\":\"3091282\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771362195.json\",\"alternate\":\"http://www.rottentomatoes.com/m/burts_buzz/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771362195/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771362195/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771362195/similar.json\"}},{\"id\":\"771380595\",\"title\":\"Petals on the Wind\",\"year\":2014,\"mpaa_rating\":\"Unrated\",\"runtime\":85,\"release_dates\":{\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_score\":-1,\"audience_rating\":\"Spilled\",\"audience_score\":52},\"synopsis\":\"A decade after Cathy (Rose McIver, \\\"Masters of Sex\\\", \\\"Once Upon a Time\\\"), Christopher (Wyatt Nash, \\\"Pretty Little Liars\\\") and Carrie (\\\"Bailey Buntain\\\", \\\"Bunheads\\\") escaped from their grandparents' attic at Foxworth Hall, \\\"Petals on the Wind\\\" continues to follow the twisted plight of the family as they attempt to put their sordid past behind them, but soon discover certain secrets can't be left behind. When Cathy finds herself in an abusive relationship with a fellow dancer, Julian (Will Kemp, \\\"90210\\\"), Christopher and Cathy are forced to face the forbidden feelings they developed for one another while coming of age during captivity. But when tragedy strikes the Dollangangers once again, Cathy returns to Foxworth Hall to confront her grandmother and seek revenge on her mother with a plan to seduce her husband Bart (Dylan Bruce, \\\"Orphan Black\\\"). When Christopher runs to Cathy's side, the two are determined to start over again - together. (c) Lifetime TV\",\"posters\":{\"thumbnail\":\"http://content7.flixster.com/movie/11/18/05/11180501_tmb.jpg\",\"profile\":\"http://content7.flixster.com/movie/11/18/05/11180501_tmb.jpg\",\"detailed\":\"http://content7.flixster.com/movie/11/18/05/11180501_tmb.jpg\",\"original\":\"http://content7.flixster.com/movie/11/18/05/11180501_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Heather Graham\",\"id\":\"162666085\"},{\"name\":\"Ellen Burstyn\",\"id\":\"162660525\"},{\"name\":\"Rose McIver\",\"id\":\"770672334\"},{\"name\":\"Wyatt Nash\",\"id\":\"771455633\"},{\"name\":\"Bailey Buntain\",\"id\":\"771417613\"}],\"alternate_ids\":{\"imdb\":\"3496892\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771380595.json\",\"alternate\":\"http://www.rottentomatoes.com/m/petals_on_the_wind/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771380595/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771380595/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771380595/similar.json\"}},{\"id\":\"771350910\",\"title\":\"Honour\",\"year\":2014,\"mpaa_rating\":\"Unrated\",\"runtime\":104,\"critics_consensus\":\"\",\"release_dates\":{\"theater\":\"2014-07-11\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_rating\":\"Rotten\",\"critics_score\":43,\"audience_rating\":\"Spilled\",\"audience_score\":58},\"synopsis\":\"An urban thriller set in West London starring Paddy Considine (The World's End, In America) and rising star Aiysha Hart (Atlantis). Mona is a young British Muslim girl on the on the run from her family after they find out about her plans to run away with her Punjabi boyfriend. In a desperate bid to save face and their family honor; her mother and older brother enlist the help of a bounty hunter to track her down. (c) 108 Media\",\"posters\":{\"thumbnail\":\"http://content7.flixster.com/movie/11/17/85/11178561_tmb.jpg\",\"profile\":\"http://content7.flixster.com/movie/11/17/85/11178561_tmb.jpg\",\"detailed\":\"http://content7.flixster.com/movie/11/17/85/11178561_tmb.jpg\",\"original\":\"http://content7.flixster.com/movie/11/17/85/11178561_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Paddy Considine\",\"id\":\"162652573\",\"characters\":[\"Bounty Hunter\"]},{\"name\":\"Aiysha Hart\",\"id\":\"771436195\",\"characters\":[\"Mona\"]},{\"name\":\"Nikesh Patel\",\"id\":\"771436196\",\"characters\":[\"Tanvir\"]},{\"name\":\"Shubham Saraf\",\"id\":\"771436197\",\"characters\":[\"Adel\"]},{\"name\":\"Faraz Ayub\",\"id\":\"771436198\",\"characters\":[\"Kasim\"]}],\"alternate_ids\":{\"imdb\":\"1738351\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771350910.json\",\"alternate\":\"http://www.rottentomatoes.com/m/honour_2013/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771350910/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771350910/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771350910/similar.json\"}},{\"id\":\"771363950\",\"title\":\"The Dead 2: India\",\"year\":2013,\"mpaa_rating\":\"R\",\"runtime\":\"\",\"release_dates\":{\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_score\":-1,\"audience_rating\":\"Spilled\",\"audience_score\":14},\"synopsis\":\"Another darkly mysterious Continent becomes an inhospitable dead zone in THE DEAD 2: INDIA. The highly anticipated follow-up to the award-winning Ford Brothers' critically acclaimed zombie road movie The Dead sees the cult franchise move to the hustle and bustle of India as the devastating outbreak takes hold. Set against the spectacular vistas and stunning scenery of Rajasthan, known as The Land of the Kings and one of the world's first and oldest civilizations, THE DEAD 2: INDIA puts the Ford Brothers' unique apocalyptic vision on a far bigger canvas in terms of breathtaking scope, thrilling action, death-defying stunts, emotional resonance and spine-tingling fright. (c) Official Site\",\"posters\":{\"thumbnail\":\"http://content8.flixster.com/movie/11/17/34/11173434_tmb.jpg\",\"profile\":\"http://content8.flixster.com/movie/11/17/34/11173434_tmb.jpg\",\"detailed\":\"http://content8.flixster.com/movie/11/17/34/11173434_tmb.jpg\",\"original\":\"http://content8.flixster.com/movie/11/17/34/11173434_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Joseph Millson\",\"id\":\"771030091\"},{\"name\":\"Meenu Mishra\",\"id\":\"771454292\"},{\"name\":\"Anand Krishna Goyal\",\"id\":\"771499122\"},{\"name\":\"Sandip Datta Gupta\",\"id\":\"771499123\"},{\"name\":\"Poonam Mathur\",\"id\":\"771499124\"}],\"alternate_ids\":{\"imdb\":\"2917336\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771363950.json\",\"alternate\":\"http://www.rottentomatoes.com/m/the_dead_2_india/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771363950/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771363950/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771363950/similar.json\"}},{\"id\":\"771379141\",\"title\":\"Armed Response (In Security)\",\"year\":2013,\"mpaa_rating\":\"R\",\"runtime\":93,\"release_dates\":{\"theater\":\"2013-04-25\",\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_score\":-1,\"audience_rating\":\"Spilled\",\"audience_score\":19},\"synopsis\":\"\",\"posters\":{\"thumbnail\":\"http://content7.flixster.com/movie/11/17/99/11179985_tmb.jpg\",\"profile\":\"http://content7.flixster.com/movie/11/17/99/11179985_tmb.jpg\",\"detailed\":\"http://content7.flixster.com/movie/11/17/99/11179985_tmb.jpg\",\"original\":\"http://content7.flixster.com/movie/11/17/99/11179985_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Ethan Embry\",\"id\":\"162664368\"},{\"name\":\"Michael J.X. Gladis\",\"id\":\"770805868\"},{\"name\":\"Clea DuVall\",\"id\":\"162695603\"},{\"name\":\"Ving Rhames\",\"id\":\"162693220\"},{\"name\":\"Vinnie Jones\",\"id\":\"162707683\"}],\"alternate_ids\":{\"imdb\":\"2081274\"},\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771379141.json\",\"alternate\":\"http://www.rottentomatoes.com/m/armed_response_2013/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771379141/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771379141/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771379141/similar.json\"}},{\"id\":\"771383017\",\"title\":\"Dragonfyre\",\"year\":2013,\"mpaa_rating\":\"Unrated\",\"runtime\":97,\"release_dates\":{\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_score\":-1,\"audience_rating\":\"Spilled\",\"audience_score\":33},\"synopsis\":\"In a world of dragons, orcs and wizards, only one man stands between the world and pure evil. As the world's Sentinel, John must stand against an army of orcs, the lord of dragons, and an evil sorceress hell-bent on sacrificing a beautiful princess. John must fight with every weapon in his arsenal, as he and his unlikely band of soldiers face a constant onslaught from bloodthirsty orcs and fire-breathing dragons.\",\"posters\":{\"thumbnail\":\"http://d3biamo577v4eu.cloudfront.net/static/images/redesign/poster_default_thumb.gif\",\"profile\":\"http://d3biamo577v4eu.cloudfront.net/static/images/redesign/poster_default_thumb.gif\",\"detailed\":\"http://d3biamo577v4eu.cloudfront.net/static/images/redesign/poster_default_thumb.gif\",\"original\":\"http://d3biamo577v4eu.cloudfront.net/static/images/redesign/poster_default_thumb.gif\"},\"abridged_cast\":[{\"name\":\"Rusty Joiner\",\"id\":\"770828022\"},{\"name\":\"Masiela Lusha\",\"id\":\"770673403\"},{\"name\":\"Wesley John\",\"id\":\"771496173\"},{\"name\":\"Isaac C. Singleton Jr.\",\"id\":\"771014598\"},{\"name\":\"Maclain Nelson\",\"id\":\"770849164\"}],\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771383017.json\",\"alternate\":\"http://www.rottentomatoes.com/m/dragonfyre/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771383017/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771383017/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771383017/similar.json\"}},{\"id\":\"771387332\",\"title\":\"House Of The Witchdoctor\",\"year\":2013,\"mpaa_rating\":\"Unrated\",\"runtime\":87,\"release_dates\":{\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_score\":-1,\"audience_rating\":\"Upright\",\"audience_score\":100},\"synopsis\":\"Evil wreaks pure havoc and bloody murder upon Leslie Van Hooten, a beautiful young girl, and her unsuspecting fellow grad students as they make their way to her family's extravagant and yet isolated estate.\",\"posters\":{\"thumbnail\":\"http://content8.flixster.com/movie/11/18/02/11180298_tmb.jpg\",\"profile\":\"http://content8.flixster.com/movie/11/18/02/11180298_tmb.jpg\",\"detailed\":\"http://content8.flixster.com/movie/11/18/02/11180298_tmb.jpg\",\"original\":\"http://content8.flixster.com/movie/11/18/02/11180298_tmb.jpg\"},\"abridged_cast\":[{\"name\":\"Bill Moseley\",\"id\":\"368451839\"},{\"name\":\"Leslie Easterbrook\",\"id\":\"770669328\"},{\"name\":\"Allan Kayser\",\"id\":\"770678380\"},{\"name\":\"Callie Stephens\",\"id\":\"771502723\"},{\"name\":\"Steffie Grote\",\"id\":\"771502724\"}],\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771387332.json\",\"alternate\":\"http://www.rottentomatoes.com/m/house_of_the_witchdoctor/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771387332/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771387332/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771387332/similar.json\"}},{\"id\":\"771361643\",\"title\":\"The Dead 2\",\"year\":2013,\"mpaa_rating\":\"R\",\"runtime\":98,\"release_dates\":{\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_score\":-1,\"audience_rating\":\"Spilled\",\"audience_score\":0},\"synopsis\":\"When the zombie plague hits India, an American turbine engineer embarks on a terrifying 300 mile journey to save his girlfriend and their unborn child on the outskirts of the Mumbai slums. It all started with a single infected worker from Somalia. From the moment he stepped onto the docks, the fate of the entire country was sealed. Now, in one of the most populated countries on the planet, there is no escaping the curse of the living dead. Meanwhile, in the serine countryside, Nicholas Burton (Joseph Millson) works to build a remote wind farm. Upon receiving a panicked call from his girlfriend Ishani (Meenu Mishra) in Mumbai, Nicholas is shocked to learn that she is pregnant, and that the city has been overrun by flesh eaters. Now, in order to reach her in time to catch the last flight out of the country, Nicholas must fight his way across the country with few weapons, and only a street-smart youth named Javed (Anand Goyal) to guide him. ~ Jason Buchanan, Rovi\",\"posters\":{\"thumbnail\":\"http://d3biamo577v4eu.cloudfront.net/static/images/redesign/poster_default_thumb.gif\",\"profile\":\"http://d3biamo577v4eu.cloudfront.net/static/images/redesign/poster_default_thumb.gif\",\"detailed\":\"http://d3biamo577v4eu.cloudfront.net/static/images/redesign/poster_default_thumb.gif\",\"original\":\"http://d3biamo577v4eu.cloudfront.net/static/images/redesign/poster_default_thumb.gif\"},\"abridged_cast\":[{\"name\":\"Joseph Millson\",\"id\":\"771030091\",\"characters\":[\"Nicholas Burton\"]}],\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771361643.json\",\"alternate\":\"http://www.rottentomatoes.com/m/the_dead_2_2013/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771361643/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771361643/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771361643/similar.json\"}},{\"id\":\"771387169\",\"title\":\"Strawberry Shortcake: Berry Best Friends\",\"year\":2014,\"mpaa_rating\":\"Unrated\",\"runtime\":68,\"release_dates\":{\"dvd\":\"2014-09-16\"},\"ratings\":{\"critics_score\":-1,\"audience_score\":0},\"synopsis\":\"It's friends first for Strawberry Shortcake and her favorite gal pals in Berry Best Friends! When Orange Blossom's general store overflows with a new line of fruits and veggies, she tries to handle all of the details without any help from others, and, as a result, she's exhausted! Strawberry is excited to be building a new marketplace, but has a tough time learning how to graciously say, \\\"no, thank you.\\\" Both soon learn that talking about what you need is the berry best thing to do. When the BFFs form a new band called Strawberry and the Sweet Beats, they're all jazzed to head out on the road...except Orange, who is afraid to admit that she doesn't want to leave home. Once she tells her friends how she feels, she's ready to set out for a rockin' good time!\",\"posters\":{\"thumbnail\":\"http://content8.flixster.com/movie/11/18/03/11180306_tmb.jpg\",\"profile\":\"http://content8.flixster.com/movie/11/18/03/11180306_tmb.jpg\",\"detailed\":\"http://content8.flixster.com/movie/11/18/03/11180306_tmb.jpg\",\"original\":\"http://content8.flixster.com/movie/11/18/03/11180306_tmb.jpg\"},\"abridged_cast\":[],\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771387169.json\",\"alternate\":\"http://www.rottentomatoes.com/m/strawberry_shortcake_berry_best_friends/\",\"cast\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771387169/cast.json\",\"reviews\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771387169/reviews.json\",\"similar\":\"http://api.rottentomatoes.com/api/public/v1.0/movies/771387169/similar.json\"}}],\"links\":{\"self\":\"http://api.rottentomatoes.com/api/public/v1.0/lists/dvds/upcoming.json?page_limit=16&country=us&page=1\",\"next\":\"http://api.rottentomatoes.com/api/public/v1.0/lists/dvds/upcoming.json?page_limit=16&country=us&page=2\",\"alternate\":\"http://www.rottentomatoes.com/dvd/upcoming.json\"},\"link_template\":\"http://api.rottentomatoes.com/api/public/v1.0/lists/dvds/upcoming.json?page_limit={results-per-page}&page={page-number}&country={country-code}\"}";
    private static final int DEFAULT_PORT = 9999;

    public EspressoTest() {
        super(MainActivity.class);
    }

    private MockWebServer mockWebServer;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mockWebServer = new MockWebServer();
        MockResponse response = new MockResponse();
        response.setBody(RESPONSE_STRING.getBytes());
        response.setResponseCode(200);
        mockWebServer.enqueue(response);
        mockWebServer.play(DEFAULT_PORT);
        Espresso.registerIdlingResources(new VolleyIdlingResource("VolleyCalls"));
        getActivity();
    }

    public void testLoadsGodzilla() {
        Espresso.onView(ViewMatchers.withId(R.id.content_list))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.hasDescendant(ViewMatchers.withText("Godzilla"))));
    }

    public void testClickingShowsSynopsis() {
        Espresso.onView(ViewMatchers.withText("Godzilla"))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.synopsis))
                .check(ViewAssertions.matches(ViewMatchers.withText("In Summer 2014, the world's most revered monster is reborn as Warner Bros. Pictures and Legendary Pictures unleash the epic action adventure \"Godzilla.\" From visionary new director Gareth Edwards (\"Monsters\") comes a powerful story of human courage and reconciliation in the face of titanic forces of nature, when the awe-inspiring Godzilla rises to restore balance as humanity stands defenseless. (c) Warner Bros")));

    }

    @Override
    protected void tearDown() throws Exception {
        if(mockWebServer != null) {
            mockWebServer.shutdown();
        }
        super.tearDown();
    }
}