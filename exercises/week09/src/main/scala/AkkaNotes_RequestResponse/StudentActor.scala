import AkkaNotes_RequestResponse.StudentProtocol.InitSignal
import TeacherProtocol.{QuoteRequest, QuoteResponse}
import akka.actor.{Actor, ActorLogging, ActorRef}

class StudentActor (teacherActorRef:ActorRef) extends Actor with ActorLogging {

  def receive = {
    case InitSignal=> {
      teacherActorRef!QuoteRequest
    }

    case QuoteResponse(quoteString) => {
      log.info ("Received QuoteResponse from Teacher")
      log.info(s"Printing from Student Actor $quoteString")
    }
  }
}