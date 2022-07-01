## how many methods are to execute the query ?

- executeUpdate()
- executeQuery()
- execute()

# executeUpdate(); 
- is for updation group of sql statement means when i execute that query ,the database is updated.
					//create,insert,update,drop 
					return type of executeUpdate() is int

# executeQuery(); 
 - is only for selection group of sql statement like retriving the data ,no modification in db
					executeQuery() method return type  is ResultSet Object.

# execute(); 
- is used for both updation and selection group of sql statement
				return type of execute() is boolean just for checking purpose
				for updation sql statement return false and for selection return true here true means whats data is available 

```
sending the query to db is nothing but executing the query 
so through the connection only we have to send the query
```
## procedure call 

```
# select : CALL dz.selectEmployee();

DELIMITER $$

DROP PROCEDURE IF EXISTS `dz`.`selectEmployee` $$
CREATE PROCEDURE `dz`.`selectEmployee` ()
BEGIN
 select * from employee;
END $$

DELIMITER ;

# insert : CALL dz.insertEmp('xyz','xyz@gmail.com',29,48000);

DELIMITER $$

DROP PROCEDURE IF EXISTS `insertEmp` $$
CREATE PROCEDURE `dz`.`insertEmp`(in name varchar(50),in email varchar(50),in age  int,in sal double)
BEGIN
  insert into employee (ename,email,age,salary) values(name,email,age,sal);
END $$

DELIMITER ;


# update : CALL updateEmp(6,'xyz','xyz@gmail.com',29,20000)

DELIMITER $$

DROP PROCEDURE IF EXISTS `updateEmp` $$
CREATE PROCEDURE `dz`.`updateEmp`(in id int,in name varchar(50),in emails varchar(50),in ages int,in sal double)
BEGIN
  update employee set ename=name,email=emails,age=ages,salary=sal where eid=id;
END $$

DELIMITER ;

# delete : CALL deleteEmp(6)

DELIMITER $$

DROP PROCEDURE IF EXISTS `deleteEmp` $$
CREATE PROCEDURE `dz`.`deleteEmp`(in id int)
BEGIN
  delete from employee where eid=id;
END $$

DELIMITER ;

# select by id :  CALL dz.selectById(3);

DELIMITER $$

DROP PROCEDURE IF EXISTS `selectEmpById` $$
CREATE PROCEDURE `dz`.`selectById`(in id int)
BEGIN
  select * from employee where eid=id;
END $$

DELIMITER ;

or 

DELIMITER $$

DROP PROCEDURE IF EXISTS `selectEmpById` $$
CREATE PROCEDURE `dz`.`selectEmpById`(in id int,out name varchar(50),out emails varchar(50),out ages int,out sal double )
BEGIN
   select ename into name from employee where eid=id;
   select email into emails from employee where eid=id;
   select age   into ages from employee where eid=id;
   select salary into sal from employee where eid=id;
END $$

DELIMITER ;


```
