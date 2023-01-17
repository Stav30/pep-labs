SELECT student.id , student.student_name 
FROM class INNER JOIN student
ON class.id = student.class_title
WHERE class.id = 1 || 2;