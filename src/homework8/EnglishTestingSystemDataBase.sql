CREATE TABLE questions
(question_id SERIAL PRIMARY KEY,
 question_text VARCHAR(100) NOT NULL UNIQUE
);

INSERT INTO questions(question_text)
VALUES ('The doctor ___ in the office.'),
	('If I ___ you, I would do this.'),
	('She is late. She ___ missed the bus.');

CREATE TABLE options
(question_id INTEGER references questions (question_id),
option_text TEXT[] NOT NULL UNIQUE, 
correct_answer VARCHAR(100) NOT NULL
);

INSERT INTO options(option_text, question_id, correct_answer)
VALUES ('{am, is, are}', 1, 'is'),
('{were, am, is, are}', 2, 'were'),
('{should have, cannot have, could not have, was able to, must have}', 3, 'must have');


SELECT q.*, o.*,
FROM questions as q
JOIN options as o ON q.question_id = o.question_id;

