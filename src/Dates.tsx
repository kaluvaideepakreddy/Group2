import * as React from 'react';
import Button from '@mui/material/Button';
import Stack from '@mui/material/Stack';

export default function Dates() {
    return (
        <Stack direction="row" spacing={4} style={{padding:"20px"}}>
            <Button variant="outlined" > Jan 1 </Button>
            <Button variant="outlined" > Jan 2 </Button>
            <Button variant="outlined" > Jan 3 </Button>
            <Button variant="outlined" > Jan 4 </Button>
            <Button variant="outlined" > Jan 5 </Button>
            <Button variant="outlined" > Jan 6 </Button>
            <Button variant="outlined" > Jan 7 </Button>
        </Stack>
    );
}
