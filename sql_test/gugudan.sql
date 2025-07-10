CREATE TABLE gugudan1(
	dan INT
	,num INT
	,result INT
);

INSERT
	INTO
	gugudan1 (dan,
	num,
	result)
SELECT
	d
	,
	n
	,
	d * n
from
	(
	SELECT
		1 AS d
UNION
	SELECT
		2
UNION
	SELECT
		3
UNION
	SELECT
		4
UNION
	SELECT
		5
UNION
	SELECT
		6
UNION
	SELECT
		7
UNION
	SELECT
		8
UNION
	SELECT
		9) AS dan,
	(
	SELECT
		1 AS n
UNION
	SELECT
		2
UNION
	SELECT
		3
UNION
	SELECT
		4
UNION
	SELECT
		5
UNION
	SELECT
		6
UNION
	SELECT
		7
UNION
	SELECT
		8
UNION
	SELECT
		9) AS num;

SELECT 
	dan
	,
	num
	,
	result
from
	gugudan1
order by
	dan,
	num;