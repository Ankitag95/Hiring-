export class User {
    fName:String ;
    lName: String ;
    qlid: String ;
    skills:String ;
    skills2:String;
    skills3:String;
    skills4:String;
    skills5:String;
    month:String;
    year:String;
    number: String ;
    email:String;
    password:String;
    cpassword:String ;

    constructor(
        fName:String ,
        lName: String ,
        qlid: String ,
        skills:String ,
        skills2:String,
        skills3:String,
        skills4:String,
        skills5:String,
        month:String,
        number: String ,
        email:String,
        password:String,
        cpassword:String ,
        year: String
        )
        
        {
        this.fName= fName;
        this.lName = lName;
        this.qlid = qlid;
        this.skills= skills;
        this.month=month;
        this.email=email;
        this.number=number;
        this.year=year;
        
}
}
