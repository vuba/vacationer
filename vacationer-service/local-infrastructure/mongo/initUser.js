db.createUser(
    {
      user: "admin",
      pwd: "admin",
      roles: [
        {role: "readWrite", db: "vacationer"}
      ]
    }
);
//db.clients.insertOne(
//  {
//    }
//)