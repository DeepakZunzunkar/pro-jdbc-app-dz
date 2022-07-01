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
