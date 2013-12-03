h2-contrib-fn
=============

h2 contrib functions to support native functions of other databases.


Usage
-----
```
   drop alias if exists NEWID;
   
   create alias NEWID for "com.github.skhatri.h2contrib.Function.newId";
```

The above substitute allows for queries like "SELECT newid() from sometable" in H2 when running in MS-SQL compatibility mode
for sybase database.
