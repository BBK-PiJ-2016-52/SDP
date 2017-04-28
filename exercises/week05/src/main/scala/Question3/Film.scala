package Question3

case class Film(name : String, yearOfRelease : Int, imdbRating : Double, director : Director) {

  def directorsAge(): Int = yearOfRelease

  def isDirectedBy(d: Director): Boolean = {
    if (director.equals(d)) true else false
  }

  def copy(newName: String, newYearOfRelease: Int, newImdbRating: Double, newDirector: Director): Film = {
    new Film(newName, newYearOfRelease, newImdbRating, newDirector)
  }
}

object Film {

  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
  
  def highestRating(film1: Film, film2: Film): Any ={
    if (film1.imdbRating < film2.imdbRating) film2 else film1
  }

}

