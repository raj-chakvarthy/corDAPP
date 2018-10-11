package net.corda.training.contract;

import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.Contract;
import static net.corda.core.contracts.ContractsDSL.requireSingleCommand;
import net.corda.core.transactions.LedgerTransaction;

import net.corda.training.state.IOUState;

/**
 * This is where you'll add the contract code which defines how the [IOUState] behaves. Looks at the unit tests in
 * [IOUContractTests] for instructions on how to complete the [IOUContract] class.
 */
public class IOUContract implements Contract {
    public static final String IOU_CONTRACT_ID = "net.corda.training.contract.IOUContract";

    /**
     * Add any commands required for this contract as classes within this interface.
     * It is useful to encapsulate your commands inside an interface, so you can use the [requireSingleCommand]
     * function to check for a number of commands which implement this interface.
     */
    public interface Commands extends CommandData {
        // Add commands here.
        // E.g
        // class DoSomething extends TypeOnlyCommandData implements Commands{}
    }
    /**
     * The contract code for the [IOUContract].
     * The constraints are self documenting so don't require any additional explanation.
     */
    @Override
    public void verify(LedgerTransaction tx) {
        // Add contract code here.
        // requireThat(req -> {
        //     ...
        // });
    }
}