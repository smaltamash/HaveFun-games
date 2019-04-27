package havefun.altamash.games;
import controlsystem.altamash.control.Control_System;
import game.altamash.breakit.breakitmain.*;
import game.altamash.minehunt.*;
import game.altamash.snake.Snake_Game_Final_Frame;
import game.altamash.snake.Snake_Game_Frame;
import game.altamash.snake.Snake_Game_Intro_Frame;
import game.altamash.snake.Snake_Game_Screen;
import game.altamash.snake.Snake_Game_Selection_Frame;
import game.altamash.snake.Snake_Game_Start_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Final_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Input_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Intro_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Start_Frame;
public class HaveFun_Main
{
    static boolean havefunState, havefunLoop1, havefunLoop2;
    static boolean snakeLoop1, snakeLoop2, snakeLoop3, snakeLoop4, snakeLoop5, gameStateRunningSnake;
    static boolean tttLoop1, tttLoop2, tttLoop3, tttLoop4, tttLoop5, gameStateRunningTTT;
    static boolean minehuntLoop1, minehuntLoop2, minehuntLoop3, minehuntLoop4,minehuntLoop5, gameStateRunningMineHunt;
    static boolean breakitLoop1, breakitLoop2, breakitLoop3, breakitLoop4, breakitLoop5, gameStateRunningBreakit;
    static boolean controlSystemState;
    public static void main(String[] args)
    {
        havefunState = true;
        while (havefunState)
        {
            System.out.print("");
            havefunState = false;
            HaveFun_Intro_Frame HaveFunIntroFrame = new HaveFun_Intro_Frame();
            havefunLoop1 = true;
            while (havefunLoop1)
            {
                System.out.print("");
                if (HaveFun_Intro_Frame.returnHaveFunIntroFrame == true)
                {
                    havefunLoop1 = false;
                    HaveFunIntroFrame.dispose();
                    HaveFun_Selection_Frame HaveFunSelection = new HaveFun_Selection_Frame();
                    havefunLoop2 = true;
                    while (havefunLoop2)
                    {
                        System.out.print("");
                        if (HaveFun_Selection_Frame.returnHaveFunSelectionFrameSnake == true)
                        {
                            havefunLoop2 = false;
                            HaveFunSelection.dispose();
                            gameStateRunningSnake = true;
                            while (gameStateRunningSnake)
                            {
                                System.out.print("");
                                gameStateRunningSnake = false;
                                Snake_Game_Intro_Frame SnakeGameIntroFrame = new Snake_Game_Intro_Frame();
                                snakeLoop1 = true;
                                while (snakeLoop1)
                                {
                                    System.out.print("");
                                    if (SnakeGameIntroFrame.returnSnakeGameIntroFrame == true) {
                                        snakeLoop1 = false;
                                        Snake_Game_Selection_Frame SnakeGameSelectionFrame = new Snake_Game_Selection_Frame();
                                        SnakeGameIntroFrame.dispose();
                                        snakeLoop2 = true;
                                        while (snakeLoop2) {
                                            System.out.print("");
                                            if (SnakeGameSelectionFrame.returnSnakeGameSelectionFrame == true) {
                                                snakeLoop2 = false;
                                                Snake_Game_Start_Frame SnakeGameStartFrame = new Snake_Game_Start_Frame();
                                                SnakeGameSelectionFrame.dispose();
                                                snakeLoop3 = true;
                                                while (snakeLoop3) {
                                                    System.out.print("");
                                                    if (SnakeGameStartFrame.returnSnakeGameStartFrame == true) {
                                                        snakeLoop3 = false;
                                                        Snake_Game_Frame SnakeGameFrame = new Snake_Game_Frame();
                                                        SnakeGameStartFrame.dispose();
                                                        snakeLoop4 = true;
                                                        while (snakeLoop4) {
                                                            System.out.print("");
                                                            if (Snake_Game_Screen.returnSnakeGameFrame == true) {
                                                                snakeLoop4 = false;
                                                                Snake_Game_Final_Frame SnakeGameFinalFrame = new Snake_Game_Final_Frame();
                                                                snakeLoop5 = true;
                                                                while (snakeLoop5) {
                                                                    System.out.print("");
                                                                    if (SnakeGameFinalFrame.returnSnakeGameFinalFrameRestart == true) {
                                                                        snakeLoop5 = false;
                                                                        SnakeGameFrame.dispose();
                                                                        SnakeGameFinalFrame.dispose();
                                                                        gameStateRunningSnake = true;
                                                                    }
                                                                    if (SnakeGameFinalFrame.returnSnakeGameFinalFrameMainMenu == true) {
                                                                        snakeLoop5 = false;
                                                                        SnakeGameFrame.dispose();
                                                                        SnakeGameFinalFrame.dispose();
                                                                        havefunState = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (HaveFun_Selection_Frame.returnHaveFunSelectionFrameTTT == true) {
                            havefunLoop2 = false;
                            HaveFunSelection.dispose();
                            gameStateRunningTTT = true;
                            while (gameStateRunningTTT) {
                                System.out.print("");
                                gameStateRunningTTT = false;
                                Tic_Tac_Toe_Game_Intro_Frame TTTGameIntroFrame = new Tic_Tac_Toe_Game_Intro_Frame();
                                tttLoop1 = true;
                                while (tttLoop1) {
                                    System.out.print("");
                                    if (TTTGameIntroFrame.returnTTTGameIntroFrame == true) {
                                        tttLoop1 = false;
                                        Tic_Tac_Toe_Game_Input_Frame TTTGameInputFrame = new Tic_Tac_Toe_Game_Input_Frame();
                                        TTTGameIntroFrame.dispose();
                                        tttLoop2 = true;
                                        while (tttLoop2) {
                                            System.out.print("");
                                            if (TTTGameInputFrame.returnTTTGameInputFrame == true) {
                                                tttLoop2 = false;
                                                Tic_Tac_Toe_Game_Start_Frame TTTGameStartFrame = new Tic_Tac_Toe_Game_Start_Frame();
                                                TTTGameInputFrame.dispose();
                                                tttLoop3 = true;
                                                while (tttLoop3) {
                                                    System.out.print("");
                                                    if (TTTGameStartFrame.returnTTTGameStartFrame == true) {
                                                        tttLoop3 = false;
                                                        Tic_Tac_Toe_Game_Frame TTTGameFrame = new Tic_Tac_Toe_Game_Frame();
                                                        TTTGameStartFrame.dispose();
                                                        tttLoop4 = true;
                                                        while (tttLoop4) {
                                                            System.out.print("");
                                                            if (TTTGameFrame.returnTTTGameFrame == true) {
                                                                tttLoop4 = false;
                                                                Tic_Tac_Toe_Game_Final_Frame TTTGameFinalFrame = new Tic_Tac_Toe_Game_Final_Frame();
                                                                tttLoop5 = true;
                                                                while (tttLoop5) {
                                                                    System.out.print("");
                                                                    if (TTTGameFinalFrame.returnTTTGameFinalFrameRestart == true) {
                                                                        tttLoop5 = false;
                                                                        TTTGameFrame.dispose();
                                                                        TTTGameFinalFrame.dispose();
                                                                        gameStateRunningTTT = true;
                                                                    }
                                                                    if (TTTGameFinalFrame.returnTTTGameFinalFrameMainMenu == true) {
                                                                        tttLoop5 = false;
                                                                        TTTGameFrame.dispose();
                                                                        TTTGameFinalFrame.dispose();
                                                                        havefunState = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (HaveFun_Selection_Frame.returnHaveFunSelectionFrameMineHunt == true) {
                            havefunLoop2 = false;
                            HaveFunSelection.dispose();
                            gameStateRunningMineHunt = true;
                            while (gameStateRunningMineHunt) {
                                System.out.print("");
                                gameStateRunningMineHunt = false;
                                Mine_Hunt_Game_Intro_Frame MineHuntGameIntroFrame = new Mine_Hunt_Game_Intro_Frame();
                                minehuntLoop1 = true;
                                while (minehuntLoop1) {
                                    System.out.print("");
                                    if (MineHuntGameIntroFrame.returnMineHuntGameIntroFrame == true) {
                                        minehuntLoop1 = false;
                                        Mine_Hunt_Game_Ask_Frame MineHuntGameAskFrame=new Mine_Hunt_Game_Ask_Frame();
                                        MineHuntGameIntroFrame.dispose();
                                        minehuntLoop2 = true;
                                        while (minehuntLoop2) {
                                            System.out.print("");
                                            if(MineHuntGameAskFrame.returnMineHuntGameAskFrame==true)
                                            {
                                                minehuntLoop2=false;
                                                Mine_Hunt_Game_Start_Frame MineHuntGameStartFrame=new Mine_Hunt_Game_Start_Frame();
                                                MineHuntGameAskFrame.dispose();
                                                minehuntLoop3=true;
                                                while(minehuntLoop3)
                                                {
                                                    System.out.print("");
                                                    if (MineHuntGameStartFrame.returnMineHuntGameStartFrame == true) {
                                                        minehuntLoop3 = false;
                                                        Mine_Hunt_Game_Frame MineHuntGameFrame = new Mine_Hunt_Game_Frame();
                                                        MineHuntGameStartFrame.dispose();
                                                        minehuntLoop4 = true;
                                                        while (minehuntLoop4) {
                                                            System.out.print("");
                                                            if (Mine_Hunt_Game_Screen.returnMineHuntGameFrame == true) {
                                                                minehuntLoop4 = false;
                                                                Mine_Hunt_Game_Final_Frame MineHuntGameFinalFrame = new Mine_Hunt_Game_Final_Frame();
                                                                minehuntLoop5 = true;
                                                                while (minehuntLoop5) {
                                                                    System.out.print("");
                                                                    if (MineHuntGameFinalFrame.returnMineHuntGameFinalFrameRestart == true) {
                                                                        minehuntLoop5 = false;
                                                                        MineHuntGameFrame.dispose();
                                                                        MineHuntGameFinalFrame.dispose();
                                                                        gameStateRunningMineHunt = true;
                                                                    }
                                                                    if (MineHuntGameFinalFrame.returnMineHuntGameFinalFrameMainMenu == true) {
                                                                        minehuntLoop5 = false;
                                                                        MineHuntGameFrame.dispose();
                                                                        MineHuntGameFinalFrame.dispose();
                                                                        havefunState = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (HaveFun_Selection_Frame.returnHaveFunSelectionFrameBreakit == true) {
                            havefunLoop2 = false;
                            HaveFunSelection.dispose();
                            gameStateRunningBreakit = true;
                            while (gameStateRunningBreakit) {
                                System.out.print("");
                                gameStateRunningBreakit = false;
                                Breakit_Game_Intro_Frame BreakitGameIntroFrame = new Breakit_Game_Intro_Frame();
                                breakitLoop1 = true;
                                while (breakitLoop1) {
                                    System.out.print("");
                                    if (BreakitGameIntroFrame.returnBreakitGameIntroFrame == true) {
                                        breakitLoop1 = false;
                                        Breakit_Game_Selection_Frame BreakitGameSelectionFrame=new Breakit_Game_Selection_Frame();
                                        BreakitGameIntroFrame.dispose();
                                        breakitLoop2 = true;
                                        while (breakitLoop2) {
                                            System.out.print("");
                                            if(BreakitGameSelectionFrame.returnBreakitGameSelectionFrame==true)
                                            {
                                                breakitLoop2=false;
                                                Breakit_Game_Start_Frame BreakitGameStartFrame=new Breakit_Game_Start_Frame();
                                                BreakitGameSelectionFrame.dispose();
                                                breakitLoop3=true;
                                                while(breakitLoop3)
                                                {
                                                    System.out.print("");
                                                    if (BreakitGameStartFrame.returnBreakitGameStartFrame == true) {
                                                        breakitLoop3 = false;
                                                        Breakit_Game_Frame BreakitGameFrame = new Breakit_Game_Frame();
                                                        BreakitGameStartFrame.dispose();
                                                        breakitLoop4 = true;
                                                        while (breakitLoop4) {
                                                            System.out.print("");
                                                            if (Breakit_Game_Screen.returnBreakitGameFrame == true) {
                                                                breakitLoop4 = false;
                                                                Breakit_Game_Final_Frame BreakitGameFinalFrame = new Breakit_Game_Final_Frame();
                                                                breakitLoop5 = true;
                                                                while (breakitLoop5) {
                                                                    System.out.print("");
                                                                    if (BreakitGameFinalFrame.returnBreakitGameFinalFrameRestart == true) {
                                                                        breakitLoop5 = false;
                                                                        BreakitGameFrame.dispose();
                                                                        BreakitGameFinalFrame.dispose();
                                                                        gameStateRunningBreakit = true;
                                                                    }
                                                                    if (BreakitGameFinalFrame.returnBreakitGameFinalFrameMainMenu == true) {
                                                                        breakitLoop5 = false;
                                                                        BreakitGameFrame.dispose();
                                                                        BreakitGameFinalFrame.dispose();
                                                                        havefunState = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (HaveFun_Selection_Frame.returnHaveFunSelectionFrameBS == true) {
                            havefunLoop2 = false;
                            HaveFunSelection.dispose();
                            Control_System ControlSystem = new Control_System();
                            controlSystemState = true;
                            while (controlSystemState) {
                                System.out.print("");
                                if (Control_System.returnControlSystemMainMenu == true) {
                                    controlSystemState = false;
                                    ControlSystem.dispose();
                                    havefunState = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
