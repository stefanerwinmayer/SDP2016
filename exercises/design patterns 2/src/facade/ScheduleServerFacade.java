package facade;

/**
 * Created by smayer04 on 04/02/2016.
 */
public class ScheduleServerFacade {
    private ScheduleServer scheduleServer;

    public ScheduleServerFacade() {
        scheduleServer = new ScheduleServerImpl();
    }

    public void start() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");
    }

    public void stop() {
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
