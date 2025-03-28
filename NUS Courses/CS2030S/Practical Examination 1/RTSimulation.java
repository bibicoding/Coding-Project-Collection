import java.util.Scanner;

/**
 * This class implements a RT System simulation.
 *
 * @author Ashish Dandekar
 * @version CS2030S AY23/24 Semester 2
 */
class RTSimulation extends Simulation {
  // TODO: Uncomment the following line to get started
  private RTSystem rtsys;

  /**
   * The list of ticket events to populate
   * the simulation with.
   */
  public Event[] initEvents;

  /**
   * Constructor for a RT System simulation.
   *
   */
  public RTSimulation(Scanner sc) {
    int priorityLevels = sc.nextInt();
    int queueSize = sc.nextInt();

    // TODO: Uncomment the following line to get started
    this.rtsys = new RTSystem(priorityLevels, queueSize);

    int numAdmins = sc.nextInt();
    int numTickets = sc.nextInt();
    initEvents = new Event[numAdmins + numTickets];

    int id = 0;

    for (int i = 0; i < numAdmins; i++) {
      double arrivalTime = sc.nextDouble();
      int adminId = sc.nextInt();
      // TODO: Uncomment the following lines to get started
      Admin admin = new Admin(adminId);
      initEvents[id] = new AdminArrivalEvent(arrivalTime, rtsys, admin);
      id += 1;
    }

    for (int i = 0; i < numTickets; i++) {
      double filingTime = sc.nextDouble();
      int priority = sc.nextInt();
      double processingTime = sc.nextDouble();
      // TODO: Uncomment the following lines to get started
      Ticket ticket = new Ticket(priority, processingTime);
      initEvents[id] = new TicketSubmittedEvent(filingTime, rtsys, ticket);
      id += 1;
    }
  }

  /**
   * Retrieve an array of events to populate the
   * simulator with.
   *
   * @return An array of events for the simulator.
   */
  @Override
  public Event[] getInitialEvents() {
    return initEvents;
  }
}
