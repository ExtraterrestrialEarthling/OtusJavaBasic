CREATE TABLE questions
(question_id SERIAL PRIMARY KEY,
 question_text VARCHAR(100) NOT NULL UNIQUE
);

INSERT INTO questions(question_text)
VALUES ('The doctor ___ in the office.'),
	('If I ___ you, I would do this.'),
	('She is late. She ___ missed the bus.');

CREATE TABLE options
(option_id SERIAL PRIMARY KEY,
option_text VARCHAR(100) NOT NULL UNIQUE
);

INSERT INTO options(option_text)
VALUES ('am'),
('is'),
('are'),
('were'),
('should have'),
('can''t have'),
('couldn''t have'),
('was able to'),
('must have');

CREATE TABLE questions_options
(question_id INTEGER references questions(question_id),
option_id INTEGER references options(option_id),
is_correct BOOLEAN NOT NULL,
PRIMARY KEY(question_id, option_id)
)

INSERT INTO questions_options(question_id, option_id, is_correct)
VALUES(1, 1, false),
(1, 2, true),
(1, 3, false),
(2, 1, false),
(2, 2, false),
(2, 3, false),
(2, 4, true),
(3, 5, false),
(3, 6, false),
(3, 7, false),
(3, 8, false),
(3, 9, true);

SELECT q.*, o.*, qo.is_correct
FROM questions as q
JOIN questions_options as qo ON q.question_id =qo.question_id
JOIN options as o ON qo.option_id = o.option_id

