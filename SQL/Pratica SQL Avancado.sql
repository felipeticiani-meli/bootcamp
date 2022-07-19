USE movies_db;

SELECT * FROM series;

-- 1
SELECT series.title, genres.name
FROM series
INNER JOIN genres
ON series.genre_id = genres.id;

-- 2
SELECT episodes.title as Episode, CONCAT(actors.first_name, ' ', actors.last_name) as Actor
FROM episodes
INNER JOIN actor_episode
ON episodes.id = actor_episode.episode_id
INNER JOIN actors
ON actors.id = actor_episode.actor_id;

-- 3
SELECT series.title as Serie, COUNT(seasons.serie_id) as Seasons
FROM series
INNER JOIN seasons
ON series.id = seasons.serie_id
GROUP BY series.title;

-- 4
SELECT genres.name as genre, COUNT(movies.genre_id) as movies
FROM genres
INNER JOIN movies
ON genres.id = movies.genre_id
GROUP BY genres.name
HAVING movies >= 3;

-- 5
SELECT DISTINCT(CONCAT(actors.first_name, ' ', actors.last_name)) as actors
FROM actors
INNER JOIN actor_movie
ON actors.id = actor_movie.actor_id
INNER JOIN movies
ON movies.id = actor_movie.movie_id
WHERE movies.title LIKE '%La Guerra de las galaxias%';