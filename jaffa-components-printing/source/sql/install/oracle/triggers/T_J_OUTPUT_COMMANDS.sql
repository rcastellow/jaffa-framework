CREATE OR REPLACE TRIGGER T_J_OUTPUT_COMMANDS
BEFORE INSERT ON J_OUTPUT_COMMANDS
FOR EACH ROW
BEGIN
  SELECT S_J_OUTPUT_COMMANDS_1.NEXTVAL INTO :NEW.OUTPUT_COMMAND_ID FROM DUAL;
END J_OUTPUT_COMMANDS;
/
