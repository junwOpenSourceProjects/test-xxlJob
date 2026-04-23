package wo1261931870.testxxljob.core.model;

import java.util.Date;

/**
 * 任务日志报表
 * 用于存储每日任务执行的汇总统计数据
 *
 * @author xuxueli 2017-06-27 18:00:00
 */
public class XxlJobLogReport {

    private int id;

    private Date triggerDay;

    private int runningCount;
    private int sucCount;
    private int failCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTriggerDay() {
        return triggerDay;
    }

    public void setTriggerDay(Date triggerDay) {
        this.triggerDay = triggerDay;
    }

    public int getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(int runningCount) {
        this.runningCount = runningCount;
    }

    public int getSucCount() {
        return sucCount;
    }

    public void setSucCount(int sucCount) {
        this.sucCount = sucCount;
    }

    public int getFailCount() {
        return failCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }
}
