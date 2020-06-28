db.createUser(
    {
      user: "vacationer",
      pwd: "vacationer",
      roles: [
        {role: "readWrite", db: "vacationer"}
      ]
    }
);
//db.clients.insertOne(
//  {
//    }
//)