package shell.commands;

import shell.Command;

/**
 * Created by BSiewni on 7/4/2017.
 */
public class Help implements Command {

    @Override
    public void executeWithoutParameters() {
        System.out.println("List of available commands:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("help     --- you are already here");
        System.out.println("cd..     --- change directory level up");
        System.out.println("dir      --- show files and directories in current folder");
        System.out.println("exit     --- close application");
        System.out.println("tree     --- show all directories and subdirectories of current folder");
        System.out.println("prompt   --- changing prompt, type prompt for more options");
        System.out.println("cd       --- change directory with parameter");
        System.out.println("date     --- show date, type date for more options");
        System.out.println("cp       --- copy files, type cp for more options");
        System.out.println("ps       --- show all running processes");
        System.out.println("taskkill --- kill chosen process");
    }
}
