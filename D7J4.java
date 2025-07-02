// Base sealed class
public sealed abstract class D7J4
        permits Student4, Teacher,Researcher {
}

// Non-sealed class
non-sealed class Student4 extends D7J4 {
}

// Final concrete teacher class (cannot be extended)
final class Teacher extends D7J4{
}

//child sealed class
sealed class Researcher extends D7J4
        permits PhdResearcher, PostdocResearcher {
}

//extension of non-sealed Student
class InternationalStudent extends Student4 {
}

//final class of child sealed class
final class PhdResearcher extends Researcher{
}

final class PostdocResearcher extends Researcher
{

}